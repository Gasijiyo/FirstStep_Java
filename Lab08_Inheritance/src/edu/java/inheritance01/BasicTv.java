package edu.java.inheritance01;

//상속(inheritance)
//super class(상위 클래스), parent class(부모 클래스), base class(기본 클래스)
//sub class(하위 클래스), child class(자식 클래스), derived class(유도 클래스)
//Smart TV is a Basic TV. (스마트 TV은 TV이다.)
//SmartTv: 하위 클래스, BasicTv: 상위 클래스

public class BasicTv {
	// 필드(멤버 변수)
	private boolean powerOn;
	private int channel;
	private int volume;
	
	// 생성자를 정의하지 않으면, 자바 컴파일러가 기본 생성자를 자동으로 만들어줌.
	
	// getters & setters
	public boolean isPowerOn() {
		return powerOn;
	}
	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	// 메서드
	public void powerOnOff() {
		if (powerOn) {
			powerOn = false;
			System.out.println("TV을 끕니다...");
		} else {
			powerOn = true;
			System.out.println("TV가 켜졌습니다.");
		}
	}

}  // end class BasicTv