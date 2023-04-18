package star;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : "); //우측 아래 90도 직각삼각형
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
