package chap08;

public class CarTest {
	public static void main(String[] args) {
		//객체생성
		Car myCar=new Car();
		
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("색상:"+myCar.color);
		System.out.println("현재속도:"+myCar.speed);
		
		//myCar의 speed 값 변경
		myCar.speed=60;
		System.out.println("수정된 속도:"+myCar.speed);
	}
}
