package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {

		CarManager mgr=new CarManager();
		mgr.add(new Bus("11호1245",5000,45));//add 메서드에는 Car를 달라고 했지만 Bus도 Truck도 Car가 있으므로
		mgr.add(new Bus("33나2343",9000,15));
		mgr.add(new Truck("55소9783",7000,3));
		mgr.print();
		System.out.println("======= Bus List =======");
		mgr.busList();
		System.out.println("총 버스의 좌석수:"+mgr.getBustSeats());
		System.out.println("5000만원 이상인 차량 수:"+mgr.getCount(6000));
		Car[] re=mgr.getCars(6000);
		for(Car c: re) { //re에 있는 데이터의 개수만큼 포문이 돈다. 배열이 꽉 차있기 때문에.
			System.out.println(c);
		}
	}

}
