package chap11;

class Person{
	String name;
	String age;
	
	public Person(String name) {
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

public class CastTest2 {

	public static void main(String[] args) {
		Person p;
		Student s=new Student("Lee");
		p=s; //업캐스팅 자동타입변환, student객체가 person타입으로 업캐스팅, student 필드 메소드 접근 불가능
		
		System.out.println(p.name);
		
		Person p1 = new Student("Kim");
		Student s1;
		s1=(Student)p1; //강제형변환(downcasting)
		
		System.out.println(s1.name);
		s1.grade="A";
		

	}

}
