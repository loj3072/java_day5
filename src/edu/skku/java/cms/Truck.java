package edu.skku.java.cms;

public class Truck extends Car {
	private double ton;

	public Truck() {
		super();
	}

	public Truck(String num, int price, double ton) {
		super(num, price);
		setTon(ton); //set쓰는게 좋은 코드
	}

	public double getTon() {
		return ton;
	}

	public void setTon(double ton) {
		this.ton = ton;
	}

	@Override
	public String toString() {
		return "Truck [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", ton=" + ton + "]";
	}
	
	

}
