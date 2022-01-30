package edu.java.thread02;

/*
 * 쓰레드 생성 방법 2:
 * 1) Runnable 인터페이스를 구현하는 클래스를 정의
 * 2) Runnable 구현 클래스에서 run() 메서드를 override -> 쓰레드가 할 일을 정의
 * 3) Runnable 구현 클래스의 객체를 생성
 * 4) 3)에서 생성된 Runnable 객체를 파라미터에 전달해서 Thread 클래스의 인스턴스를 생성
 * 5) 4)에서 생성된 Thread 객체의 start() 메서드를 호출 -> 쓰레드 시작 
 * 
 */

public class ThreadMain02 {

	public static void main(String[] args) {
		
		// 1) Runnable 구현 클래스 정의 - local inner class
		class MyRunnable implements Runnable {
			private String name;
			
			public MyRunnable(String name) {
				this.name = name;
			}
			
			// 2) run() 메서드 override
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + ": 안녕하세요, " + name);
					try {
						// MyRunnable 클래스는 Thread를 상속받는 클래스가 아니기 때문에 Thread의 메서드들을 상속받지 못함.
						// 대신에, 클래스 이름으로 접근해서, Thread 클래스에서 static으로 선언된 sleep 메서드 호출
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			} // end run()
		} // end class MyRunnable

		// 3) Runnable 객체 생성
		Runnable process1 = new MyRunnable("Java!");
		Runnable process2 = new MyRunnable("Swing...");
		
		// 4) Thread 객체 생성: new Thread(Runnable r) 생성자 사용
		Thread th1 = new Thread(process1);
		Thread th2 = new Thread(process2);
		Thread th3 = new Thread(new MyRunnable("Hello!"));
		
		// 익명 클래스(anonymous local class)를 사용한 Thread 객체 생성
		Thread th4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + " : Hello, Runnable!");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		// Functional interface: 구현해야 할 추상 메서드를 오직 한 개만 갖고 있는 인터페이스.
		// 람다 표현식(lambda expression): Functional 인터페이스를 구현하는 클래스의 객체를 간단히 표현하는 방법.
		// (파라미터 선언) -> { 메서드 구현; }
		Thread th5 = new Thread(() -> {
			// run 메서드가 할 일.
			for (int i = 1; i <= 100; i++) {
				System.out.println(i + " : 안녕, Lambda!");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// 5) Thread 시작
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		// th1, th2이 끝날 때까지 main 메서드 대기
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n===== main thread 종료 =====");
	} // end main()

} // end class ThreadMain02