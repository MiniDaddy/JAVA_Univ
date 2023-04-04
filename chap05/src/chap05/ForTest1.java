/**
 * 2023.04.04
 * 정광민
 * 입력받은 숫자의 약수를 모두 출력하시오
 * #문제분석
 * -변수 : num,i
 * #알고리즘
 * 1.num 입력받기
 * 2.i가 num과 같아질 때 까지 반복
 * 3.반복문 안에 if(num%i==0){ i 출력 } 반복
 */
package chap05;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input number : ");
		int num=sc.nextInt();
		System.out.print(num+"의 약수는 ");
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
