/**
 * 2023.03.28
 * 정광민
 * 1~1000의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램(for)*/

package chap05;

import java.util.Scanner;

public class TextEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp=0;
		System.out.print("숫자 입력 : ");
		int inNum = sc.nextInt();
		
		for(int i=1; i<=1000; i++) {
			if(i%inNum==0) {
				temp+=i;
			}
		}
		System.out.println(temp);		
	}
}
