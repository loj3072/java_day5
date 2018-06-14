package edu.skku.java.cms;

public class Bus extends Car {
	private int seat;
	
	public Bus() {
		super(); //상속받은 슈퍼 클래스의 생성자 Car()도 부름
	}
	
	public Bus(String num, int price, int seat) {
		super(num, price); //super=Car를 부름/ 상속받은 슈퍼 클래스의 생성자 Car(String num, int price)도 호출
		setSeat(seat);
	}
	
	public void start() {
		System.out.println("버스 출발~");
	}
	
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	

	@Override
	public String toString() {
		return "Bus [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", seat=" + seat + "]";
	}
	
	
}
