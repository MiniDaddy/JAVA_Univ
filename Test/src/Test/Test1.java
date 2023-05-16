package Test;

import java.util.Scanner;
class Add {
//	public Add() {}
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a+b;
	}
}

class Sub{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a-b;
	}
}
class Mul{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a*b;
	}
}
class Div{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		return a/b;
	}
}
public class Test1 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Add add=new Add();
		Sub sub=new Sub();
		Mul mul=new Mul();
		Div div=new Div();
		System.out.print("두 정수 연산자 입력 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		add.setValue(a, b);
		sub.setValue(a, b);
		mul.setValue(a, b);
		div.setValue(a, b);
		System.out.println(add.calculate());
		System.out.println(sub.calculate());
		System.out.println(mul.calculate());
		System.out.println(div.calculate());
		
	}
}
