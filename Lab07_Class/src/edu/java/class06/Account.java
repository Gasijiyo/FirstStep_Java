package edu.java.class06;

//은행 계좌 클래스
//속성(상태, 데이터) : 계좌번호, 잔액
//기능: 입금(deposit), 출금(withdraw), 송금(transfer), 정보(info)
public class Account {
	//field
	int accountNo;	//계좌번호
	double balance; //잔액
	
	//파라미터가 2개인 생성자
	public Account(int accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public void info() {
		System.out.println("--계좌정보--");
		System.out.println("계좌번호: " + accountNo);
		System.out.println("잔액: " + balance);
		System.out.println("-------");
	}
	//매소드
	/**
	 * 입금(deposit) - 잔액 balance를 amount만큼 증가
	 * 
	 * @param amount - double. 입금할 금액
	 * 
	 * @return 입금 후 잔액을 리턴
	 */
	public double Deposit(double amount) {
		balance += (double)amount;
		return balance;
	}
	
	
	/**
	 * 출금 withdraw - 잔액balance에서 amount만큼 감소
	 *
	 *@param amount double 출금할 금액
	 *@return 출금 후 잔액 리턴
	 */
	public double Withdraw(double amount) {
		if (balance > (double)amount) {
		balance -= (double)amount;
		} else {
			
		}
		return balance;
		//System.out.println("잔액이 부족합니다");		
	}
	
	/**
	 * 이체 transfer - amount를 to 다른계좌로 이체
	 * 
	 * @param amount - double입금할 금액, 
	 * @paran to - account 이체할 계좌
	 * @return true (이체성공)
	 */
	public boolean Transfer (double amount, Account to) {
//		balance -= (double)amount;
//		to.balance += amount;
		Withdraw(amount);
		to.Deposit(amount);
		
		return true;
	}
	
	
}
