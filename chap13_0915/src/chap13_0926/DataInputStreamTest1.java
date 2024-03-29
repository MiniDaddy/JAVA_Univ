package chap13_0926;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputStreamTest1 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 파일명을 입력 >>");
		String s=sc.next();
		
		FileInputStream fis = new FileInputStream(s);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		fis.close();
	}

}
