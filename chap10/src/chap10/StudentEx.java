package chap10;

public class StudentEx {

	public static void main(String[] args) {
		Student std=new Student("홍길동","1234-5678",1);
		System.out.println("name : "+std.name+"\nssn : "+std.ssn+"\nstudentNo : "+std.studentNo);
	}

}
