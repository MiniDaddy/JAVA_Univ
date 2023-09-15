package chap13_0915;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt"); //a.txt파일 읽어오기
			int i;
			while((i=file.read())!=-1) { //file내용이 있을 때
				System.out.println((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		

	}

}
