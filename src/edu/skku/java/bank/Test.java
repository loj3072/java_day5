package edu.skku.java.bank;

public class Test {

	public static void main(String[] args) {
		BankManager mgr=new BankManager();
		mgr.add(new Account("11-111",1111,600000));
		mgr.add(new Minus("56-1233",5555,500000,100000));
		mgr.add(new Account("33-111",3333,100000));
		mgr.add(new Minus("78-1233",7777,150000,500000));
		mgr.search();
		System.out.println("11-111 검색:"+mgr.search("11-111"));
		mgr.searchMinus();
		System.out.println("전체금액:"+mgr.getTotal());
		mgr.deposit("11-111", 5000);
		System.out.println();
		mgr.withdraw("11-111", 1111, 500000);
		System.out.println("11-111 검색:"+mgr.search("11-111"));
		
	}

}
