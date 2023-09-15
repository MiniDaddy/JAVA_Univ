package chap13_0915;

import java.util.Scanner;

public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inputNum1=sc.nextInt();
		int inputNum2=sc.nextInt();
		try {
			System.out.println(inputNum1/inputNum2);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("해당 예외 : "+e);
//			e.printStackTrace();
		}
	}
}
