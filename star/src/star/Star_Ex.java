package star;

import java.util.Scanner;

public class Star_Ex {

	public static void main(String[] args) { //2씩 증가하는 삼각형
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
