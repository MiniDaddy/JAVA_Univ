package chap13_0919;

import java.io.File;

public class FileDirTest1 {
	public static void main(String[] args) {
		String dir="C:/Windows";
		File f1=new File(dir); //파일 객체 생성
		if(f1.isDirectory()) {
			System.out.println("검색 디렉토리\n"+dir);
			System.out.println("================");
			
			//dir에 적힌 경로 안의 모든 요소를 문자열의 배열로 생성
			String s[]=f1.list();
			
			for(int i=0; i<s.length; i++) {
				//문자열의 항목으로 객체 생성
				File f = new File(dir+"/"+s[i]);
				if(f.isDirectory()) {
					System.out.println(s[i]+" >> 디렉토리"); //얘는 디렉토리다 표시
				}else {
					System.out.println(s[i]+" >> 파일"); //얘는 파일임을 표시
				}
			}
		}else {
			System.out.println("지정한 "+dir+"(은)는 디렉토리가 아닙니다.");
		}
		
	}
}
