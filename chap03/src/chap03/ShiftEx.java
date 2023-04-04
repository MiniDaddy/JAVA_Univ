/**
 * 시프트연산자
 * 20230321
 * 정광민*/
package chap03;

import java.util.Scanner;

public class ShiftEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 숫자 입력 :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("a="+a+"("+Integer.toBinaryString(a)+")");
		System.out.println("b="+b+"("+Integer.toBinaryString(b)+")");
		
		System.out.println("a<<2"+(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
		System.out.println("a>>2"+(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
		
		System.out.println("b<<2"+(b<<2)+"("+Integer.toBinaryString(b<<2)+")");
		System.out.println("b>>2"+(b>>2)+"("+Integer.toBinaryString(b>>2)+")");
	}

}
