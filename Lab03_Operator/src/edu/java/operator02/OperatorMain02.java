package edu.java.operator02;

public class OperatorMain02 {

	public static void main(String[] args) {
		// 증가, 감소 연산자  : ++, --
		int num = 100;
		System.out.println("num = " + num);
		
		//변수 num의 값을 1 증가
		//num = num + 1;
		//num += 1;  1을 더한 후 저장
		++num; // 11, 12, 13번 줄 코드는 같은 내용
		System.out.println("num = " + num);
		
		//변수 num의 값을 1 감소
		// num = num -1;
		// num -= 1;
		--num ;
		System.out.println(num);
		
		//증가(++), 감소(--) 연산자가 단독으로 사용되는 경우
		//변수 앞(prefix), 변수 뒤(suffix)에서 사용될 수 있음 
		// ++num, num++ 는 같은 결과
	
		//증가, 감소 연산자가 다른 연산자들과 함꼐 사용 시
		//변수 앞 : 증가/감소 연산 먼저 수행 후 다른 연산자 수행
		//변수 뒤 : 다른연산자 먼저 수행 후 증가/감소 연산 수행
		
		int x = 10;
		int y = ++x + 5;
		//++x;
		//int y = x + 5;
		
		//연산순서 :
		//++x 먼저 수행 (변수 앞), = 11 
		//x + 5 = 11+5 =16
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 10;
		y = x++ + 5;
		// 연산순서 :
		// x + 5 = 10 + 5 = 15 -> y에 할당
		// x++ 수행 -> 11
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
