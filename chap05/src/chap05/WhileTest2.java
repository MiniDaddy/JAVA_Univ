/**
 * 2023.04.04
 * 정광민
 * 입력받은 숫자의 팩토리얼 구하기
 * #문제분석
 * -변수 : fac, facValue
 * #알고리즘
 * fac의 값 입력 받음
 * 1부터 fac의 값 까지 반복하며 차례대로 곱해 facValue에 저장
 */
package chap05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("팩토리얼을 구할 수 입력 : ");
		int fac=sc.nextInt();
		int facValue=1;
		while(1<fac) { //<=쓸 시 1* 출력되는거 꼴보기싫어서 그냥 1은 따로 출력
			System.out.print(fac+"*");
			facValue*=fac--;
		}
		System.out.println("1 = "+facValue);
	}

}
