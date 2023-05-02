/**
 * 20230502 정광민
 * 오버로딩실습
 * */
package chap08;

public class Car1Test {
/*오버로딩*/
	public static void main(String[] args) {
		//1번째 생성자 오버로딩
		Car1 car1=new Car1();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		//2번째 생성자 오버로딩
		Car1 car2=new Car1("자가용");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println();
		//3번째 생성자 오버로딩
		Car1 car3=new Car1("자가용","빨강");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();
		
		//4번째 생성자 오버로딩
		Car1 car4=new Car1("택시","검정",150);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();
	}

}
