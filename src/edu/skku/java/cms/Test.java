package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("11너1234",5000);
		Car c2 = new Bus(); //Car를 상속받았으니 타입을 슈퍼타입인 Car로 바꿔도 ok!
		Car c3 = new Bus("44호6543",8000,45);
		Car c4 = new Truck("74노3645",9000,3); //Truck을 상속받은 DumpTruck이었다고 해도 ok/ 메모리에는 DumpTruck, Truck, Car가 올라감. 메모리에 있는 것은 다 올 수 있다.
		
		c.start();//Car의 start()
		c1.start();//Car의 start()
		c2.start();//Bus의 start()
		c3.start();//Bust의 start()
		c4.start();//Truck의 의 start() //DumpTruck의 start() (Car, Truck, DumpTruck... 마지막으로 오버라이딩 된 것)
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
