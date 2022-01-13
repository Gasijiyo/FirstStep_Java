package edu.java.method06;

public class MethodMain06 {

	public static void main(String[] args) {
		// main 메소드 : JRE (java 실행환경)이 프로그램 실행 시 가장먼저 호출하는 메소드
		// main 메소드의 파라미터 args : JRE가 프로그램에게 전달하는 값들(arguments)
		//Eclipse 메뉴 중 Run -> Run Configurations -> Argument탭 -> Program argument 
		// -> 값들을 '공백' 으로 구별해 입력 -> 적용 후 실행  
		System.out.println("argument 개수 : " + args.length);
		for (String x : args) {
			System.out.println(x);
		}
	}

}
