package edu.java.interface03;

public class InterfaceMain03 {

	public static void main(String[] args) {
		// Customer 인스턴스 생성
		Customer customer1 = new Customer();
		customer1.buy();
		customer1.sell();
		
		System.out.println();
		Buyer customer2 = new Customer();	//다형성(polymorphism)
		customer2.buy();
		//생성된 인스턴스는 Customer 타입이지만 참조 변수 선언을 Buyer로 했기 때문에 Buyer 인터페이스의 메소드만 보임.
		//강제 타입 변환(casting)을 사용하면 Seller 인터페이스의 메소드도 사용 가능.
		if (customer2 instanceof Customer) {
			((Customer)customer2).sell();
		}
		if (customer2 instanceof Seller) {
			((Seller)customer2).sell();
		}
		System.out.println();
		Customer customer3 = new Customer();
		customer3.order();
		
	}

} //end class


//상속 extends 와 구현 implements를 동시에 하는 경우
class SuperClass {}
interface MyInterface {}
class SubClass extends SuperClass implements MyInterface {}

//2개 이상의 인터페이스를 구현하는 경우:
interface Buyer {
	void buy();
	
	//다른 인터페이스에서 같은 signature(리턴 타입, 이름, 파라미터)를 같는 default 메소드가 있는 경우
	default void order() {
		System.out.println("구매자 주문");
	}
}//end interface Buyer

interface Seller {
	void sell();
	
	//다른 인터페이스에서 같은 signature(리턴 타입, 이름, 파라미터)를 같는 default 메소드가 있는 경우
	default void order() {
		System.out.println("판매자 주문");
	}
}//end interface Seller

//2개 이상의 인터페이스를 구현하는 클래스에서 default메소드 이름이 중복되는 문제를 override로 해결해야만 함.
class Customer implements Buyer, Seller {

	@Override //Seller 인터페이스의 추상 메소드 구현
	public void sell() {
		System.out.println("판매");
		
	}

	@Override //buyer 인터페이스의 추상 메소드 구현
	public void buy() {
		System.out.println("구매");
		
	}

	@Override
	public void order() {
		Buyer.super.order(); //Buyer 인터페이스의 order 메소드 사용
		Seller.super.order();	//Seller 인터페이스의 order 메소드 사용
		System.out.println("Customer order 완료");
	}
	
} //end class Customer


