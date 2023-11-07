package chap16_1107;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String s1 = "name JKM gender M age 20";
		String s2 = "name,JKM,gender,M,age,20";
		String s3 = "name/JKM/gender/M/age/20";
		
		System.out.println("== 빈칸을 기준으로 분리 ==");
		StringTokenizer st1 = new StringTokenizer(s1); //(인수 안) <<- 파싱할 문자열, 토큰으로 분리할 분리자(없을 시 공백), 반환 시 분리자 포함 여부
		while(st1.hasMoreTokens()) { //token 있으면 true, else false
			String first=st1.nextToken(); //다음 토큰 기준 문자열을 반환
			String second=st1.nextToken();
			System.out.println(first+"\t"+second);
		}

		System.out.println("== 쉼표를 기준으로 분리 ==");
		StringTokenizer st2 = new StringTokenizer(s2, ",");
		while(st2.hasMoreTokens()) {
			String first=st2.nextToken();
			String second=st2.nextToken();
			System.out.println(first+"\t"+second);
		}
		
		System.out.println("== 슬래쉬를 기준으로 분리 ==");
		StringTokenizer st3 = new StringTokenizer(s3, "/");
		while(st3.hasMoreTokens()) {
			String first=st3.nextToken();
			String second=st3.nextToken();
			System.out.println(first+"\t"+second);
		}
	}

}
