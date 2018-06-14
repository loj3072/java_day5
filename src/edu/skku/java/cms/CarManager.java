package edu.skku.java.cms;

public class CarManager {//자동차를 관리하는 클래스

	//버스도 담고, 트럭도 담고... Car 배열을 만들면 오케이!
	Car[] cars=new Car[100];
	int index=0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print() {
		for(int i=0; i<index; i++) {
			System.out.println(cars[i]);//c.toString
		}
	}
	
	public void busList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) //instanceof: 오브젝트 확인. 메모리에 Bus가 있나?
				System.out.println(cars[i]);//c.toString
		}
	}
	
	public void truckList() {
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Truck) //instanceof: 오브젝트 확인. 메모리에Truck이 있나?
				System.out.println(cars[i]);//c.toString
		}
	}
	//소유한 버스들의 총 좌석수 구해서 리턴하기
	public int getBustSeats() {
		int sum=0;//리턴할 변수부터 만들고 시작!
		for(int i=0; i<index; i++) {
			if(cars[i] instanceof Bus) { //instanceof: 오브젝트 확인. 메모리에 Bus가 있나?
				Bus b=(Bus)cars[i];
				sum+=b.getSeat();
			}
		}
		return sum;
	}
	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 개수 구하기
	public int getCount(int price) {
		int cnt=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>=price) { 
				cnt++;
			}
		}
		return cnt;
	}
	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 정보를 구해서 리턴
	public Car[] getCars(int price) {
		Car[] result=new Car[getCount(price)];//개수를 구하고 배열의 크기를 저장. / 같은 클래스에서는 메서드를 그냥 불러서 쓸 수 있음
		int n=0;
		for(int i=0; i<index; i++) {
			if(cars[i].getPrice()>=price) { 
				result[n++]=cars[i];//n++:연산 끝나고 증가 / ++n:연산하기 전에 증가
				//n++;
			}
		}
		return result;
		
	}
	
}
