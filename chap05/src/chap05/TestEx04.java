/**
 * 2023.03.28
 * 정광민
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력하는 프로그램 작성
 * #문제분석
 * 변수 - first,second,result
 * #알고리즘
 * 1.두 정수 입력(first,second)
 * 2.선택문(if(first<second))
 * 3.복합논리(반복문 안에 선택문 포함)
 * 		while(first<second){ if(first%2==1){ sum+=1; } first++;}
 */
package chap05;
import java.util.Scanner;

public class TestEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 숫자 입력 :");
		int first=sc.nextInt();
		int second=sc.nextInt();
		int result=0,temp=0;
		if(first>second) {
			temp=second;
			second=first;
			first=temp;
		}
		for(int i=first; i<=second; i++) {
			if(i%2!=0) {
				result+=i;
			}else {
				continue;
			}
		}
		System.out.println(result);
	}

}