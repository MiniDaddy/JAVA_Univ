package chapter11;


abstract class myAnimal2{
	//sound라는 추상 메소드를 선언, 의미를 부여하는 것은 아래 상속 클래스에서
	abstract String sound2();
	
	//기본 정보 출력하는 메소드
	static void displayInfo2() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

class myCat2 extends myAnimal2 {

	//앞서 정의한 sound라는 추상 메소드에 Cat에서의 의미를 부여
	@Override
	String sound2() {
		return "meow";
	}
	
	
	//static 붙어있는 정적인 요소는 오버라이딩 불가
	static void displayInfo2() {
		System.out.println("고양이 울음소리 입니다.");
	}
	
}


public class AnimalTest2 {
	public static void main(String[] args) {
		myAnimal2 cat = new myCat2();
		cat.displayInfo2();
		myCat2.displayInfo2();
		myAnimal2.displayInfo2();
		System.out.println(cat.sound2());
		

	}

}
