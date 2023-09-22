/**
 * 작성일 : 2023 09 22
 * 작성자 : 컴퓨터공학과 202295032 정광민
 * 설명 : 문자를 파일에 쓰기(저장)
 * */
package chap13_0922;
import java.io.*;
import java.util.Scanner;

public class FileWriteTest1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장 파일명을 입력하세요 : ");
		String sFile = sc.next();
		
		//파일에 들어갈 문자열
		String source = "동해물과 백두산이 마르고 닳도록\n"+"하느님이 보우하사 우리나라 만세";
		
		//파일명 객체 생성
		FileWriter fw = new FileWriter(sFile);
		
		//문자열을 파일에 출력
		fw.write(source); //fw객체를 통해 source 내용을 txt파일에 저장 및 출력
		
		//스트림 종료
		fw.close();
		
		System.out.println("파일이 생성되었습니다."); //chap13_0915 폴더 바로 하위에 생성
	}
}
