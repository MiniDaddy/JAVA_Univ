package chap13_0922;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		File file = new File("c.txt");
		
		FileReader fr = new FileReader(file);
		
		//읽어오기
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();

	}

}
