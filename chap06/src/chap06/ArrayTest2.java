/**
 * 2023.04.11
 * 1차원 정수 배열 생성 후 가장 큰 값 찾기
 */
package chap06;

public class ArrayTest2 {

	public static void main(String[] args) {
		int score[]= {88,97,53,92,68,82};
		int max=score[0]; //88 일단 저장
		
		for (int i : score) { //i를 score값들과 비교하며 score만큼 실행
			if(i>max) {
				max=i;
			}
		}
		System.out.println("가장 큰 값: "+max);
	}

}
