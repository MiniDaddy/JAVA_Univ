/**
 * 2023.04.04
 * 정광민
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while, continue 이용)
 */
package chap05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num=sc.nextInt();
		int i=num,sum=0;
		
//		while(i<=100){
//			if(i%num==0) {
//				sum+=i;
//			}
//			i++;
//		}
		
//		System.out.println(num+"의 배수의 합은 "+sum);
		while(i<=100) {
			if(i%num!=0) {
				i++;
				continue;
			}else {
				sum+=i;
			}
			i++;
		}
		System.out.println(num+"의 배수의 합은 "+sum);
		
	}

}
