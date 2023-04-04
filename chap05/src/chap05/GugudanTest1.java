package chap05;

import java.util.Scanner;

public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하시오 : ");
		int dan = sc.nextInt();
		int cnt=1;
		for (; cnt<10; cnt++) {
			System.out.println(dan + " x " + cnt + " = " + dan*cnt);
		}
	}

}
