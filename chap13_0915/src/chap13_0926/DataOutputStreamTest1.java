package chap13_0926;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 파일명을 입력 >> ");
		String s=sc.next();
		
		//저장된 파일에 바이트를 출력. 8비트 단위의 출력을 위해서 FileOutputStream 클래스 이용
		FileOutputStream fos = new FileOutputStream(s);
		DataOutputStream dos = new DataOutputStream(fos);
		
		
		//싸그리 최대치 적어놓기
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('김');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MAX_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		
		fos.close();
		System.out.println("파일 생성 완료.");
		
		
	}

}
