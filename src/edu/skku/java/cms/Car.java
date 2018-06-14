package edu.skku.java.cms;

public class Car {
	private String num;
	private int price; //int 32bit 21억까지
	
	public Car() {
		super();//없으면 컴파일러가 번역하면서 알아서 집어넣음
	}
	public Car(String num, int price) {
		super();
		setNum(num);
		setPrice(price); // 직접 넣는 것보다는 set 메서드를 통해서 사용하는 것이 훨씬 더 좋음. set메서드에서 체크하고 넣을 수 있으므로.
	}
	
	public void start() {
		System.out.println("출발~");
	}
	public void stop() {
		System.out.println("멈춤~");
	}
	
	public String getNum() {
		//값이 올바른지 체크
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}

	
	
	

}
