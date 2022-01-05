package edu.java.operator02;

public class OperatorMain02 {

	public static void main(String[] args) {
		// 증가, 감소 연산자: ++, --
		int num = 100;
		System.out.println("num = " + num);  // (1)

		// 변수 num의 값을 1 증가.
		// num = num + 1;
		// num += 1;
		++num;
		System.out.println("num = " + num);  // (2)
		
		// 변수 num의 값을 1 감소.
		// num = num - 1;
		// num -= 1;
		--num;
		System.out.println("num = " + num);  // (3)
		
		// 증가(++), 감소(--) 연산자가 단독으로 사용되는 경우에는,
		// 변수 앞(prefix) 또는, 변수 뒤(suffix)에서 사용될 수 있음.
		// ++num;과 num++;는 같은 결과임.
		
		// 증가, 감소 연산자가 다른 연산자들과 함께 사용되는 경우에는,
		// (1) 변수 앞(prefix): 증가/감소 연산을 먼저 수행한 후 다른 연산자를 수행함.
		// (2) 변수 뒤(suffix): 다른 연산자를 먼저 계산한 후 증가/감소 연산을 수행함.
		int x = 10;
		int y = ++x + 5;
		// prefix로 사용된 경우 연산 순서
		// (1) ++x가 수행: x = 11
		// (2) x + 5 = 11 + 5 = 16 ---> y에 할당.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 10;
		y = x++ + 5;
		// suffix로 사용된 경우 연산 순서
		// (1) x + 5 = 10 + 5 = 15 ---> y에 할당.
		// (2) x++가 수행: x = 11
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
