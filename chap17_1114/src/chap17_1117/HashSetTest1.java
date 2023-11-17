package chap17_1117;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
	public static void main(String[] args) {
		//HashSet 객체 생성
		HashSet<Integer> odd=new HashSet<Integer>();
		HashSet<Integer> even=new HashSet<Integer>();
		
		
		for(int i=1; i<=10; i=i+2) {
			odd.add(i);
			even.add(i+1);
		}
		
		System.out.println("odd 집합의 내용 : "+odd);
		System.out.println("even 집합의 내용 : "+even);
		
		boolean setChanged=odd.add(5);
		System.out.println("odd에 5 추가 성공? "+setChanged);
		//중복 허용 안하기 때문에, 이미 있는 5를 새로 넣을 수 없음
		
		setChanged=even.add(12);
		System.out.println("even에 12 추가 성공? "+setChanged);
		
		System.out.println("odd 집합의 내용 : "+odd);
		System.out.println("even 집합의 내용 : "+even);
		
		//최대, 최소값
		System.out.println("odd에서 가장 작은 값 : "+Collections.min(odd));
		System.out.println("even에서 가장 큰 값 : "+Collections.max(even));
		
		//hashset의 각 요소를 순차 검색하여 합계 계산
		//순차적으로 만들기 위해 Iterator 사용
		Iterator<Integer> odd_it=odd.iterator();
		Iterator<Integer> even_it=even.iterator();
		int sum_odd=0;
		int sum_even=0;
		
		//odd요소를 순차적으로 검색
		while(odd_it.hasNext()) {
			sum_odd+=odd_it.next();
		}
		System.out.println("odd 집합의 합 : "+sum_odd);
		
		//even요소를 순차적으로 검색
		while(even_it.hasNext()) {
			sum_even+=even_it.next();
		}
		System.out.println("even 집합의 합 : "+sum_even);
	}

}
