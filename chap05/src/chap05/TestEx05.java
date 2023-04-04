/**
 * 2023.04.04
 * 정광민
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력하기
 * #문제분석
 * -변수 : first, second, total
 * #알고리즘
 * 1.정수 입력(first,second)
 * 2.선택문(if(first<second)
 * 3.반복문(for(first; first<=second; first++)) total+=first;
 */

package chap05;

import java.util.Scanner;

public class TestEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("first: ");
		int first=sc.nextInt();
		System.out.print("second: ");
		int second=sc.nextInt();
		int total=0;
		
		if(first>second) {
			int temp = first;
			first=second;
			second=temp;
		}
		int start=first;
		for(; start<=second; start++) {
			total+=start;
		}
		System.out.println(first+"와 "+second+" 두 수 사이의 합 :"+total);
	}

}
