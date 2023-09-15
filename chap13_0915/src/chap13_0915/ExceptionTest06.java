package chap13_0915;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest06 {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileReader file = new FileReader("a.txt"); //a.txt파일 읽어오기
		int i;
		while((i=file.read())!=-1) { //file내용이 -1이 아닐때 (사실상 무한루프)
			System.out.println((char)i);
		}
		file.close();
	}

}
