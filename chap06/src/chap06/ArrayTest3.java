/**
 * 2023.04.11
 * 1차원 배열에서 입력받은 값 검색하기(선형검색)
 */
package chap06;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int inum[]= {8,7,3,6,8,7,0,4,1,2};
		System.out.print("입력할 정수 : ");
		int key=sc.nextInt(), cnt=0;
		
		for(int i=0; i<inum.length;i++) {
			if(inum[i]==key) {
				System.out.println((i+1)+"번에서 일치");
				cnt++;
			}
		}
		if(cnt!=0) {
			System.out.println("일치하는 값 "+cnt+"개 존재함");
		}else {
			System.out.println(key+"과(와) 일치하는 값 없음");
		}
		
		
		
		sc.close();
	}

}
