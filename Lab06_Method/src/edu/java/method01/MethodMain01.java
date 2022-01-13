package edu.java.method01;
/*method : 
 1. 프로그램의 (반복되는)기능을 코드 블록으로 작성한 것.
 2. 클래스 안에서 정의(선언) 
 3. 다른 메소드 안에서는 정의(선언)할 수 없음
 
 메소드 정의(선언) 방법:
	[수식어] 리턴타입 메소드 이름(파라미터 선언, ...)
	수식어 - public, private, static, ...
	리턴타입 - 메소드 실행 끝난 후 메소드를 호출한 곳으로 반환되는 데이터타입.
	void : 메소드 반환하는 값(데이터)이 없다는 의미
	parameter : 매개변수, 인자.
	메소드의 입력값(메소드를 호출하는 곳에서 메소드에게 전달하는 값)을 저장하기 위한 지역변수.
	argument를 저장하기 위한 메소드 내부의 지역변수.
	argument : 인수. 메소드를 호출하는 곳에서 메소드에게 전달하는 값.

*/

public class MethodMain01 {

	public static void main(String[] args) { //void = 반환없음
		//메소드 정의(선언)와 사용(호출)
		System.out.println("1.");
		newLine(); //newLine() 메소드 호출
				
		System.out.println("2.");
		newLines(3); //newLines() 메소드 호출하면서 argument(값) 2를 메소드에 전달.
	
		System.out.println("3.");
		
		//Alt + left-arrow : 이전 커서 위치
		//Alt + right-arrow : 다음 커서 위치
		
	
	} //end main() method
	
	public static void newLine() {
		System.out.println();
	}// end newLine()
	
	public static void newLines(int number) {
		
		for(int i = 0; i <number; i++) {
			System.out.println();
		}
	}//end newLines()
	
}
