package chap09_1;

public class Car {

	int speed;
	void run() {
		System.out.println(speed+"km/h로 달리다.");
	}
	public static void main(String[] args) {
//		speed=60; //불가능, static 내에서 인스턴스 필드를 객체 생성 후 사용해야 함
		
		Car mycar=new Car(); //가능
		mycar.speed=60;
		mycar.run();
	}

}
