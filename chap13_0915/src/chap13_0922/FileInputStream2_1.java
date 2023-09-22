package chap13_0922;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream2_1 {

	public static void main(String[] args) {
		try {
			File file = new File("c.txt");
		
			//FileInputStream 객체 생성.
			FileInputStream fr = new FileInputStream(file);
			
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			
			fr.close();
			System.out.println("\n파일로부터 바이트를 읽어 화면에 출력했습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
