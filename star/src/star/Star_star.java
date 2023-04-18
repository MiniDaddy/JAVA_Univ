package star;

import java.util.Scanner;

public class Star_star { //진짜 별모양으로 만들기 (하든가말든가)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		for(int i=1; i<=num-2; i++) { //-2 for balanced
			for(int j=1; j<=num; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		int p = 1;
		while (p <= num) {
			int j = 1, k = 0;
			
			//k가 전체 num행에서 i만큼 뺀 값만큼 공백으로 채움
			while (j < p) { //공백이 먼저 와야 아래쪽도 정렬이 됨
				System.out.print(" ");
				j++;
			}
			while (k <= num - p) { 
				System.out.print("* ");
				k++;
			}
			System.out.print("\n");
			p++;
		}

	}

}
