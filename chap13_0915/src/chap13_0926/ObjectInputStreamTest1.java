package chap13_0926;

//txt파일을 직접 열어보면 깨짐
//직렬화시켜 입력한 객체들을 온전하게 읽어오기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectInputStreamTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 파일명을 입력 >>");
		String fileName=sc.next();
		
		//객체를 읽을 수 있는 objectInputStream 생성
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

		//직렬화된 객체 읽어오기
		Object s2 = ois.readObject();
		
		//readObject() 메소드로 직렬화된 객체의 2진 데이터를 읽어서 객체 타입으로 캐스팅함(형변환)
		PersonInfo p1 = (PersonInfo)ois.readObject();
		PersonInfo p2 = (PersonInfo)ois.readObject();
		
		//출력한 순서대로 입력
		System.out.println(s2);//1
		System.out.println("이름 : "+p1.name);//2
		System.out.println("주소 : "+p1.city);
		System.out.println("나이 : "+p1.age);
		System.out.println("----------------");
		System.out.println("이름 : "+p2.name);//3
		System.out.println("주소 : "+p2.city);
		System.out.println("나이 : "+p2.age);
		
		ois.close();
		
	}

}
