/**
 * 2023.04.04
 * 정광민
 * 입력받은 수자만큼 줄 수를 반복하면서 직각삼각형 출력
 * #문제분석
 * -변수:num,i,j
 * #알고리즘
 * i가 입력받은 수만큼 반복되는동안 j를 i크기만큼 반복시킴
 * 1.줄 수 입력(num)
 * 2.중첩반복
 * 	while(i<=num) <--행 { while(j<=i) <--열 { 별 찍기 } }
 */
package chap05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input : ");
		int num=sc.nextInt();
		int i=1; 
		while(i<=num) {
			int j=1; //첫 반복문으로 돌아갈때마다 초기화를 시켜줘야함
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
		}

	}

}
