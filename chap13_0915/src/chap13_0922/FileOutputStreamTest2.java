package chap13_0922;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException{
		OutputStream fos = new FileOutputStream("c.txt");
		//OutputStream << 바이트 스트림의 입출력을 위한 추상 클래스
		//FileOutputStream << 파일에 바이트 스트림의 입출력 기능 제공
		
		String str="자바 프로그래밍 \n문자 스트림과 바이트 스트림 \n";
		
		byte[] bt = str.getBytes(); //바이트 변환
		
		fos.write(bt);		
		System.out.println("파일 생성 완료");
		fos.close();
	}
}
