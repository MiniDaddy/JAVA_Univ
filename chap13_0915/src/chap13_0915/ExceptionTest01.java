/*
 	두 개의 정수를 입력 받아 나누는 프로그램
 */

package chap13_0915;

import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inputNum1=sc.nextInt();
		int inputNum2=sc.nextInt();
		System.out.println(inputNum1/inputNum2);
	}

}
