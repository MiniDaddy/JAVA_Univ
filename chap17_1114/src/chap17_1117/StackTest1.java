package chap17_1117;

import java.util.Scanner;
import java.util.Stack;

public class StackTest1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		//4개 과일이름 받아 스택에 저장
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("과일 이름 입력 >> ");
			String fruits=sc.next();
			
			stack.push(fruits);//stack
		}
		System.out.println("과일 리스트<스택> : "+stack);
		
		System.out.print("찾고 싶은 과일 입력 >> ");
		String f_name=sc.next();
		int fruit=stack.search(f_name);
		if(fruit!=-1) {
			System.out.println("스택에서 "+f_name+"의 위치는 "+fruit+"번 째입니다.");
		}else {
			System.out.println("스택에는 "+f_name+"가 없습니다."); 
		}
		
		
		//삭제
		System.out.println("과일 리스트<스택> 삭제");
		while(!stack.empty()) {
			String obj=stack.pop();
			System.out.println("스택에서 pop >> "+obj);
		}
	}

}
