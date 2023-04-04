/**
 * 2023.04.04
 * 정광민
 * 1~100까지 숫자를 반복적으로 입력받아 정수의 합이 1000 이상일 시 1000을 넘은 수 출력하고 평균 출력
 */
package chap05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,cnt=0;
		for(;;) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			cnt++;
			sum+=num;
			if(sum>1000) {
				System.out.println("1000을 넘겼습니다.\n1000을 넘긴 수는 "+num+"입니다.\n평균은 "+(float)sum/cnt+"입니다.");
				break;
			}
			System.out.print("1000이 되기에는 모자랍니다. ");
		}
	}

}
