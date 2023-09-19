package chap13_0919;

import java.util.Scanner;

public class ExceptionTest07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 >> ");
		try {
			int age=Integer.parseInt(sc.next());
			System.out.println(age);
		} catch (NumberFormatException e) {
			System.out.println("나이를 정수로 입력하시오 : " + e);
		}finally {
			System.out.println("프로그램 종료");
		}
	}

}
