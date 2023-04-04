/**
 * 삼항 영산자
 * 20230321
 * 정광민*/
package chap03;

import java.util.Scanner;

public class Ternary0p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int a = sc.nextInt();
		
		boolean flag;
		flag=(a%2==0)?true:false;
		System.out.println(a+"이 짝수인가?");
		System.out.println(flag);
	}

}
