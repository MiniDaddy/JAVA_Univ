package chap17_1117;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest1 {
	public static void main(String[] args) {
		LinkedList<String> queue=new LinkedList<String>();
		
		Scanner sc=new Scanner(System.in);

		//4개 과일이름 받아 큐에 저장
		for(int i=0; i<4; i++) {
			System.out.print("과일 이름 입력 >> ");
			String fruits=sc.next();
			queue.offer(fruits);
		}
		System.out.println("과일 리스트 <큐> : "+queue);
		
		System.out.print("찾고 싶은 과일 입력 >> ");
		String f_name=sc.next();
		int fruit=queue.indexOf(f_name)+1;
		if(fruit!=-1) {
			System.out.println("큐에서 "+f_name+"의 위치는 "+fruit+"번 째입니다.");
		}else {
			System.out.println("큐에는 "+f_name+"가 없습니다."); 
		}
		
		
		//삭제
		System.out.println("과일 리스트<큐> 삭제");
		while(!queue.isEmpty()) {
			String obj=queue.poll();
			System.out.println("큐에서 poll >> "+obj);
		}
		
	}

}
