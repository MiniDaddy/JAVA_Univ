/**
 * 2023.03.28
 * 정광민
 * 조건문 연습
 * 
 * */

package chap04;

import java.util.Scanner;

public class SimpleTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input score : ");
		
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("PASS");
			System.out.println("Congraturation!");
			System.out.println("Thank you!!");
		}else {
			System.out.println("NON PASS!");
		}
	}

}
