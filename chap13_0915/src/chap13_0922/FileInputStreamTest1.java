/**
 * 작성일 : 2023 09 22
 * 작성자 : 컴퓨터공학과 202295032 정광민
 * 설명 : 
 * */

package chap13_0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일명을 입력하세요 : ");
		String sFile=sc.next();
		
		FileInputStream fis = new FileInputStream(sFile);
		
		int i;
		while((i=fis.read())!=-1) { //데이터를 다 읽어올 때 까지
			System.out.print((char)i);
		}
		fis.close();
		
		System.out.println(sFile + " 파일로부터 바이트를 읽어 화면에 출력하였습니다.");
			
	}
}
