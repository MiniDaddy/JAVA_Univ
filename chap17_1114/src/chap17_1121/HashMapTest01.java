package chap17_1121;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest01 {
	public static void main(String[] args) {
		//HashMap 객체 생성
		HashMap<String, String> dict=new HashMap<String,String>();

		//3개의 k,v로 이루어진 값을 dict에 저장
		dict.put("사과", "apple"); dict.put("복숭아", "peach"); dict.put("배", "pear");
		
		//한글 단어 입력 받아 영단어 검색
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("알고싶은 과일 이름 입력 (0은 종료) >> ");
			String kor=sc.next();
			//0 입력 시 프로그램 종료
			if(kor.equals("0")) {
				System.out.println("종료");
				System.exit(1);
			}
			String eng=dict.get(kor);
			if(eng==null) {
				System.out.println("없는 단어입니다.");
			}else {
				System.out.println(eng);
			}
		}
	}

}
