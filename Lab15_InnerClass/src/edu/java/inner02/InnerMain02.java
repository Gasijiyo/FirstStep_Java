package edu.java.inner02;

import edu.java.inner02.TestWithInner.Counter;

public class InnerMain02 {

	public static void main(String[] args) {
		// Test 클래스의 인스턴스 생성
		Test t = new Test();
		// TestCounter 클래스의 인스턴스 생성
		TestCounter counter = new TestCounter(t);
		System.out.println(counter);
		counter.printCount();
		counter.addCount();
		counter.printCount();
		
		TestCounter counter2 = new TestCounter(t);
		System.out.println(counter2);
		counter2.printCount();
		counter2.addCount();
		counter2.printCount();
		
		counter.printCount();

		System.out.println("---------------");
		TestWithInner test = new TestWithInner();
		Counter counter3 = test.getCounter(); // test.new Counter();
		System.out.println(counter3);
		counter3.printCount();
		counter3.addCount();
		counter3.printCount();
		
		Counter counter4 = test.getCounter(); 
		System.out.println(counter4);
		counter4.printCount();
		counter4.addCount();
		counter4.printCount();
		
		counter3.printCount();
		
	}

}