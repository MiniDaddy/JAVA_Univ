//package chap13_0915;
//
//import java.io.FileReader;
//
//public class ExceptionTest04 {
//
//	public static void main(String[] args) {
//		FileReader file = new FileReader("a.txt"); //a.txt파일 읽어오기
//		int i;
//		while((i=file.read())!=-1) { //file내용이 -1이 아닐때 (사실상 무한루프)
//			System.out.println((char)i);
//		}
//		file.close();
//
//	}
//
//}
