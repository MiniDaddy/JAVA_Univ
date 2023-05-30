package Test;

import java.util.Scanner;

abstract class Calculation{
	abstract void calc(int a, int b);
}

class Add1 extends Calculation{
	public void calc(int a, int b) {
		System.out.println("ADD >> "+(a+b));
	}
}
class Sub1 extends Calculation{
	public void calc(int a, int b) {
		System.out.println("SUB >> "+(a-b));
	}
}
class Mul1 extends Calculation{
	public void calc(int a, int b) {
		System.out.println("MUL >> "+(a*b));
	}
}
class Div1 extends Calculation{
	public void calc(int a, int b) {
		System.out.println("DIV >> "+(a/b));
	}
}

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수 연산자 입력 >> ");
		Calculation c = new Add1();
		int a=sc.nextInt();
		int b=sc.nextInt();
		c.calc(a, b);
		c=new Sub1();
		c.calc(a, b);
		c=new Mul1();
		c.calc(a, b);
		c=new Div1();
		c.calc(a, b);
	}

}
