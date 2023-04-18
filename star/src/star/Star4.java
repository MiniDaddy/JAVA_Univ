package star;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : "); //마름모
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++) { //기울어진마름모
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		int p = 1;
		while (p <= num) {
			int j = 1, k = 0;
			
			//k가 전체 num행에서 i만큼 뺀 값만큼 공백으로 채움
			while (k <= num - p - 1) { //시작값 num-1로 해야 마름모 이쁨
				System.out.print("*");
				k++;
			}
			while (j < p) {
				System.out.print(" ");
				j++;
			}
			System.out.print("\n");
			p++;
		}
		
		//or
		
		
		for (int i = 1; i <= num; i++) { //완전마름모
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		int q = 1;
		while (q <= num) {
			int j = 1, k = 0;
			
			//k가 전체 num행에서 i만큼 뺀 값만큼 공백으로 채움
			while (j < q) { //공백이 먼저 와야 아래쪽도 정렬이 됨
				System.out.print(" ");
				j++;
			}
			while (k <= num - q - 1) { //시작값 num-1로 해야 마름모 이쁨
				System.out.print("* ");
				k++;
			}
			System.out.print("\n");
			q++;
		}

		

	}

}
