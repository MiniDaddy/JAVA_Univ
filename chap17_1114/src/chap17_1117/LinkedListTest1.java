package chap17_1117;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest1 {
	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		LinkedList<Integer> llist=new LinkedList<Integer>();
		
		long start,stop;
		int i;
		
		start=System.currentTimeMillis(); //현재시간 받아오기
		for(i=0; i<=1000000; i++) {
			alist.add(i);
		}
		stop=System.currentTimeMillis();
		System.out.println("ArrayList - 순차적 삽입 시간 : "+(stop-start));
		
		start=System.currentTimeMillis(); //현재시간 받아오기
		for(i=0; i<=1000000; i++) {
			llist.add(i);
		}
		stop=System.currentTimeMillis();
		System.out.println("LinkedList - 순차적 삽입 시간 : "+(stop-start));
		
		
		
		start=System.currentTimeMillis(); //현재시간 받아오기
		for(i=0; i<=1000; i++) {
			alist.add(500,i);
		}
		stop=System.currentTimeMillis();
		System.out.println("ArrayList - 중간 삽입 시간 : "+(stop-start));
		
		start=System.currentTimeMillis(); //현재시간 받아오기
		for(i=0; i<=1000; i++) {
			llist.add(500,i);
		}
		stop=System.currentTimeMillis();
		System.out.println("LinkedList - 중간 삽입 시간 : "+(stop-start));
		
	}

}
