package star;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input : ");//좌측 위 90도 직각삼각형
		int num=sc.nextInt();
		int i=num; 
		while(i>=0) {
			int j=1; 
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i--;
		}

	}

}
