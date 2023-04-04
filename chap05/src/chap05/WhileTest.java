/**
 * 2023.03.28
 * 정광민
 * 반복문(while, for) - 1~10합계 구하기*/

package chap05;

public class WhileTest {

	public static void main(String[] args) {
		int sum=0,cnt=1;
		while(cnt<=10) {
			sum+=cnt;
			cnt++;
		}
		System.out.println("1 ~ 10 합의 값은(while) "+sum);
		
		
		int total=0, cnt2=1;
		for (; cnt2<=10; cnt2++) {
			total+=cnt2;
		}
		System.out.println("1 ~ 10 합의 값은(for) "+total);
		
		
		int hap=0, cnt3=1;
		do {
			hap+=cnt3;
			cnt3++;
		}while(cnt3<=10);
		System.out.println("1 ~ 10 합의 값은(do-while) "+hap);
	}
}
