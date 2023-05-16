package chap09_1;

public class Calculator_Test {

	public static void main(String[] args) {
		double result1=10*10*Calculator.pi;
		int result2=Calculator.plus(10, 5);
		int result3=Calculator.minus(10, 3);
		
	System.out.println("result1 >> "+result1+"\nresult2 >> "+result2+"\nresult3 >> "+result3);
	}

}
