package edu.skku.java.bank;

public class BankManager {
	Account[] as=new Account[50];
	int index=0;//���
	
	public void add(Account a) {
		as[index++]=a;
	}
	
	public void search() {//��ü���
		for(int i=0; i<index; i++) {
			System.out.println(as[i]);//as[i].toString()
		}
	}
	
	public Account search(String num) { //�޼ҵ��� �̸��� ���� �Ķ���Ͱ� �ٸ� = �����ε�
		for(int i=0; i<index; i++) {
			if(num.equals(as[i].getNum())) return as[i];
		}
		return null;//��ã������ null! ������ �����ϵ� ���ϵ� �ݵ�� ������ �־�� ��
	}
	
	public void searchMinus() {
		for(int i=0; i<index; i++) {
			if(as[i] instanceof Minus) {
				System.out.println(as[i]);
			}
		}
	}
	
	public int getTotal() {
		int sum=0;
		for(int i=0; i<index; i++) {
			sum+=as[i].getBalance();
		}
		return sum;		
	}
	
	public void deposit(String num, int money) {
		Account a=search(num);
		if(a == null) {
			System.out.println("���¹�ȣ�� �������� ����");
			return;//return �ڿ� ���� ��� ������ void
		}
		a.deposit(money);	
	}
	
	public void withdraw(String num, int password, int money) {
		Account a=search(num);
		if(a != null) {
			a.withdraw(password, money);
		}else {
			System.out.println("���¹�ȣ�� �������� ����");
		}
	}
	
	public void trans(String num, int password, int money, String num2) {
		
		withdraw(num, password, money);
		deposit(num2, money);
		/*
		Account a=search(num);
		Account b=search(num2);
		if(a == null || b == null) {
			System.out.println("���¹�ȣ�� �������� ����");
			return;//return �ڿ� ���� ��� ������ void
		}
		a.withdraw(password, money);
		b.deposit(money);
		*/
		
	}

	
	

}
