package edu.java.thread01;

/*
 * Thread 생성 방법 1:
 * 1) Thread 클래스를 상속받는 클래스를 정의
 * 2) 상속받는 클래스에서 run() 메서드를 override -> 쓰레드가 할 일
 * 3) 상속받는 클래스의 인스턴스를 생성
 * 4) 생성된 인스턴스의 start() 메서드를 호출 -> 쓰레드 시작.
 * (주의) 쓰레드를 시작시킬 때 run 메서드를 직접 호출하지 않음!
 * 
 */


// 1) Thread를 상속받는 클래스를 정의 
class MyThread extends Thread {
	// 필드(멤버 변수)
	private String name;
	
	// 생성자
	public MyThread(String name) {
		this.name = name;
	}
	
	// 2) run 메서드를 override - 쓰레드가 할 일을 정의
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : " + "안녕하세요, " + name);
			
			try {
				sleep(10); // ms(milli-second) 단위
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end run()
	
	
} // end class MyThread


public class ThreadMain01 {

	public static void main(String[] args) {
		// 3) Thread 객체 생성
		MyThread th1 = new MyThread("오쌤");
		Thread th2 = new MyThread("Java!"); // 다형성: super 타입으로 선언된 변수에는 super/sub 타입 객체를 모두 저장할 수 있음.

		// 지역 내부 클래스(local inner class)를 사용한 Thread를 상속받는 클래스
		class MyThread2 extends Thread {
			private String name = "쓰레드...";
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i + " : Hello, " + name);
					try {
						sleep(10); // 0.01초 쉼.
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // end try-catch
				} // end for
			} // end run()
		} // end class MyThread2
		
		Thread th3  = new MyThread2(); // 인스턴스 생성
		
		// 4) Thread 시작
		th1.start();
		th2.start();
		th3.start();
		
		// main 쓰레드가 다른 쓰레드들의 실행이 끝날 때까지 기다림
		try {
			th1.join(); // th1이 끝날 때까지 main 쓰레드가 기다림
			th2.join(); // th2이 끝날 때까지 main 쓰레드가 기다림
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n-------------------------");
		System.out.println("여기는 언제 출력될까요?");
		System.out.println("-------------------------\n");
	} // end main()

}