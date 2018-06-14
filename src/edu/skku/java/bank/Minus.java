package edu.skku.java.bank;

public class Minus extends Account {
	private int limit;
	
	
	public Minus() {
		super();
	}
	

	public Minus(String num, int password, long balance, int limit) {
		super(num, password, balance);
		setLimit(limit);
	}



	//오버라이딩 규칙!!
	@Override
	public void withdraw(int password, int money) {
		if (checkPassword(password) && getBalance()+limit>=money) {//balance가 접근이 안되니 getBalance setBalance로
			setBalance(getBalance()-money);
			System.out.println("정상 출금~");
		}else {
			System.out.println("비밀번호 오류 또는 잔액 부족~");
		}
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}


	@Override
	public String toString() {
		return "Minus [" + super.toString() + ", limit=" + limit + "]";
	}

	
	

}
