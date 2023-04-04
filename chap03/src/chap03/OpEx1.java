/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전응로 교환해 주는 프로그램 작성
 * 조건1:동전의 총개수를 최소화
 * 조건2:고액의 동전 우선 교환
 * */

package chap03;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마? : ");
		int cnt = sc.nextInt();
		
		System.out.println("500원 : " + (cnt/500) + "개\n100원 : " + (cnt%500/100) + "개\n50원 : "+ (cnt%500%100/50) + "개\n10원 : " + (cnt%500%100%50/10) + "개");
	}

}
