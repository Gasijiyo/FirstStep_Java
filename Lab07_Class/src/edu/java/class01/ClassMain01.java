package edu.java.class01;

public class ClassMain01 {

	public static void main(String[] args) {
		// BasicTv 클래스 타입의 변수 선언,
		// BasicTv 인스턴스 생성하고 선언한 변수에 할당(저장)
		// 그간 우리가 해왔던 것:
		// Random r = new Random();
		// Scanner s = new Scanner();
		// int[] a = new int[5];

		// 인스턴스(instance) : 메모리에 생성된 객체
		// 붕어빵 - 객체(object), 붕어빵틀 - 클래스(class),
		// 붕어빵틀을 사용해 구워낸 실제붕어빵 - 인스턴스(instance)
		//
		
		BasicTv tv1 = new BasicTv();
		System.out.println(tv1);
		//지역변수 tv1은 basicTv 인스턴스가 생성된 메모리의 주소(참조)값을 저장하고있음.
		//참조변수: 메모리의 주소값을 저장하고 있는 지역변수
						
		tv1.info();
		// 객체가 메모리에 생성될 때 클래스의 field들은 그 데이터타입의 기본값으로 초기화 됨
		// 데이터 타입 기본값: boolean(false), int(0), double(0.0) etc..
		// 인스턴스의 field 또는 method를 사용 시 지역변수.필드/메소드 형식 사용
		// "." 은 참조연산자: 지역변수가 저장하고있는 메모리주소를 찾아간다는 의미
		System.out.println(tv1.powerOn);
		
		//TV켬
		tv1.powerOnOff();
		//볼륨 키움
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		//볼륨 줄임
		tv1.volumeDown();
		//채널 증가
		tv1.channelUp();
		//채널 감소
		tv1.channelDown();
		
		for(int i = 0; i < 6 ; i++) {
			tv1.volumeUp();
			tv1.channelUp();
		}
		for (int i = 0 ; i < 6 ; i++) {
			tv1.volumeDown();
			tv1.channelDown();
		}
		
		//tv끔
		tv1.powerOnOff();
		//tv상태 확인
		tv1.info();
				
		//두번째 basicTv인스턴스 생성
		BasicTv tv2 = new BasicTv();
		System.out.println(tv2);
		tv2.info();
		
		
	}//end main()

}

//단축키 Ctrl + Shift + F : 소스코드 포맷팅(들여쓰기)
