/**
 * 2023.03.28
 * 정광민
 * 입력된 숫자가 양수,0,음수인지 판별하는 프로그램 작성*/
package chap04;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input number : ");
		int inNum = sc.nextInt();
		if (inNum>0) {
			System.out.println("양수");
		}else if(inNum<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}


		
		
//		String result="";
//		result=inNum>0 ? "양수":(inNum<0?"음수":"0");
//		System.out.println(result);
	}
}
