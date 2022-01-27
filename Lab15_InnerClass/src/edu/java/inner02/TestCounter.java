package edu.java.inner02;

public class TestCounter {
	private Test test;
	
	public TestCounter(Test test) {
		this.test = test;
	}
	
	public void addCount() {
		test.setCount(test.getCount() + 1);
	}
	
	public void printCount() {
		System.out.println("count = " + test.getCount());
	}
}
