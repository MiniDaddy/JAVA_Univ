/**
 * 2023.04.11
 * 2차원 배열의 값은 난수로 초기화
 * 2차원 배열의 각 행의 합계 출력
 */
package chap06;

import java.util.Random;

public class MultiArrayTest {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int score[][] = new int[4][4];
		
		for(int i=0; i<4;i++) {//행
			for(int j=0; j<4; j++) {//열
				score[i][j]=rand.nextInt(10); //[i][j]에 0 ~ 9 크기 10의 랜덤 정수 생성
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k=0; k<4; k++) {
			int sum=0; //행 시작될 때 sum 생성 후 초기화
			for(int value:score[k]) {
				System.out.print(value+" ");
				sum+=value;
			}
			System.out.println("합계는 "+sum); //한 행의 값들의 합 출력 후 k++되며 sum 다시 초기화
		}
		
	}

}
