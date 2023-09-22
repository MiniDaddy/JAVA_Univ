/**
 * 작성일 : 2023 09 22
 * 작성자 : 컴퓨터공학과 202295032 정광민
 * 설명 : 파일에 저장된 문자 가져오기
 * */

package chap13_0922;
import java.io.*;
import java.util.Scanner;

public class FileReaderTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("읽을 파일명을 입력하세요 : ");
		String sFile=sc.next();
		
		try {
			//갖고올 객체 생성
			FileReader fr = new FileReader(sFile);
			
			//한 문자씩 읽기
			int i;
			while((i=fr.read())!= -1) { //데이터를 모두 읽으면 -1 반환
				System.out.print((char)i);
			}
			
			//스트림 종료
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
