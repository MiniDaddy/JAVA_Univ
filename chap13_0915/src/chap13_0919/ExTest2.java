package chap13_0919;

public class ExTest2 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("메소드 호출 후");
		} catch (ArrayStoreException e) {
			System.out.println("ArrayStoreException 예외 발생");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생");
		}
	}
	static void method1() throws RuntimeException{
		int a=0;
		int b=2/a;
		System.out.println("나눗셈 후");
	}

}
