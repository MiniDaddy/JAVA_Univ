package chap13_0926;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//이 클래스를 직렬화 할 것임을 지정
class PersonInfo implements Serializable{
	String name;
	String city;
	int age;
	//생성자
	public PersonInfo(String name, String city, int age) {
		this.name=name;
		this.city=city;
		this.age=age;
	}
}

public class ObjectWriteStreamTest1 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 파일명을 입력 >>");
		String fileName = sc.next();
		
		String s1="***고객 정보***";
		
		//직렬화된 객체를 2개 생성
		PersonInfo p1 = new PersonInfo("정광민", "부산", 21);
		PersonInfo p2 = new PersonInfo("홍길동", "서울", 20);
		
		//객체 기록할 ObjectOutputStream 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		//직렬화된 객체를 파일에 2진수로 기록
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName+"명으로 객체 파일을 생성했습니다.");
	}
	

}
