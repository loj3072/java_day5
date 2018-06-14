package edu.skku.java.bank;

public class Account {
	private String num;//계좌번호
	private int password;//비밀번호
	private long balance;//잔액
	
	
	public Account() {
		super();
	}
	
	public Account(String num, int password, long balance) {
		//super(); //지워도 컴파일러가 나중에 만들어줌
		setNum(num);//계좌번호가 맞는지
		setPassword(password);//비밀번호규격이 맞는지
		setBalance(balance);
	}


	//(계좌벌호를 확인한 후)입금
	public void deposit(int money) {
		balance +=money;
	}
	//비밀번호 체크
	public boolean checkPassword(int password) {
		//return this.password.equals(password);// 비밀번호가 문자열일때
		return this.password==password;
	}
	//출금
	public void withdraw(int password, int money) {
		if (checkPassword(password) && balance>=money) {
			balance -= money;//balance = balance-money
			System.out.println("정상 출금~");
		}else {
			System.out.println("비밀번호 오류 또는 잔액 부족~");
		}
	}
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	private int getPassword() {//패스워드는 보여줘선 안됨!
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]"; //패스워드는 숨기자!
	}
	
	

}
