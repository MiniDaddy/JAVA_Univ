package chap11;
class Parent{
	public void method1() {
		System.out.println("부모메소드1");
	}
	public void method2() {
		System.out.println("부모메소드2");
	}
}

class child extends Parent{
	@Override
	public void method2() {
		System.out.println("아이 메소드2");
	}
	public void method3() {
		System.out.println("아이 메소드3");
	}
}
public class CastingTest {
	public static void main(String[] args) {
		child child= new child();
		Parent parent=child;
		parent.method1();
		parent.method2();
	}
}
