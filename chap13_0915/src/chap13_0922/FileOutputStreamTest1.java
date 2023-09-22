/**
 * 작성일 : 2023 09 22
 * 작성자 : 컴퓨터공학과 202295032 정광민
 * 설명 : 바이트 단위로 파일에 저장
 * */

package chap13_0922;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest1{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");
		String sFile = sc.next();
		
		//파일명으로 객체 생성
		FileOutputStream fos = new FileOutputStream(sFile);
		
		int i;
		for(i=1; i<=260; i++) {
			fos.write(i); //파일에 내용 쓰기
		}
		fos.close();
		
		System.out.println(sFile+" 파일명으로 바이트 파일을 생성하였습니다.");
			
	}
}
