package edu.java.inner02;

public class TestWithInner {
	private int count;
	
	public class Counter {
		private Counter() {}
		
		public void addCount() {
			count++;
		}
		
		public void printCount() {
			System.out.println("count = " + count);
		}
		
	} // end class Counter

	public Counter getCounter() {
		// 외부 클래스의 메서드는 내부 클래스의 private 생성자를 호출할 수 있음.
		return new Counter();
	}
	
} // end TestWithInner