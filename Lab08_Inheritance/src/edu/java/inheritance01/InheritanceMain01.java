package edu.java.inheritance01;

public class InheritanceMain01 {
	
	public static void main(String[] args) {
		// BasicTv 클래스의 인스턴스를 생성
		BasicTv tv1 = new BasicTv();
		tv1.powerOnOff();  // BasicTv의 기능(메서드)를 사용
		
		// SmartTv 클래스의 인스턴스를 생성
		SmartTv tv2 = new SmartTv();
		tv2.powerOnOff();  // 하위 클래스인 SmartTv 객체에서 상위 클래스인 BasicTv로부터 상속받은 기능(메서드)를 사용.
		tv2.setIp("192.168.11.31");  // 하위 클래스만 가지고 있는 기능(메서드) 사용.
		System.out.println(tv2.getIp());
		
	}

}