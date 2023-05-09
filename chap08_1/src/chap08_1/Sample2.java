package chap08_1;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("매개 변수로 받은 두 수의 합 :" +(args[0]+args[1]));
		
		int num1=Integer.parseInt(args[0]); //메인메서드 안의 문자열은 String이므로
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("합 : "+(num1+num2));
	}

}
