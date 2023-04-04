/**
 * 윤년 계산 프로그램
 * 조건1:4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
 * 조건2:400으로 나누어 떨어지는 해도 윤년에 포함 된다.
 * 20230321
 * 정광민
 * */
package chap03;

import java.util.Scanner;

public class OpEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		System.out.println(year+"년은 "+(year%400==0||(year%4==0&&year%100!=0)?"윤년":"윤년 x")+"입니다.");
	}

}
