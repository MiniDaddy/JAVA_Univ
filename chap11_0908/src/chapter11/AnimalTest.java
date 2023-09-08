package chapter11;


abstract class myAnimal{
	//sound라는 추상 메소드를 선언, 의미를 부여하는 것은 아래 상속 클래스에서
	abstract String sound();
	
	//기본 정보 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

class myCat extends myAnimal {

	//앞서 정의한 sound라는 추상 메소드에 Cat에서의 의미를 부여
	@Override
	String sound() {
		return "meow";
	}
	
	//재정의
	@Override
	void displayInfo() {
		System.out.println("고양이 울음소리 입니다.");
	}
	
	
}


public class AnimalTest {
	public static void main(String[] args) {
		myAnimal cat = new myCat();
		cat.displayInfo();
		System.out.println(cat.sound());
		

	}

}
