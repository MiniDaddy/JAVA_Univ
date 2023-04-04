/**
 * 2023.03.28
 * 정광민
 * */
package chap04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input job : ");
		String job = sc.next();
		
		System.out.println("input age : ");
		int age = sc.nextInt();
		
		if((job.equals("7") || job.equals("8")) && (age>=40 && age<50)) {
			System.out.println("연급 80%");
		}else if((job.equals("5") || job.equals("6")) && (age/10==5)/*<-- age>=50 && age<60*/) { 
			System.out.println("연금 100%");
		}else {
			System.out.println("연금 대상자 아님");
		}

	}

}
