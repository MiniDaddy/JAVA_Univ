package chap08_1;

class Calculator{
	void powerOn() {
		System.out.println("power on");
	}
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	double divide(int x, int y) {
		double result=(double)x/(double)y;
		return result;
	}
	void powerOff() {
		System.out.println("power off");
	}
	
	//매개변수의 개수를 모를 경우1(배열 타입 선언)
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	//매개변수의 개수 모를 경우2
	int sum2(int... values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	
}


public class MethodTest {
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		
		int result1=myCalc.plus(5, 6);
		System.out.println("result1:"+result1);
		
		byte x=10;
		byte y=4;
		double result2=myCalc.divide(x, y);
		System.out.println("result2:"+result2);
		
		int []values1= {1,2,3};
		int result3=myCalc.sum1(values1);
		System.out.println("result3:"+result3);
		
		int result4=myCalc.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4:"+result4);
		
		int result5=myCalc.sum2(1,2,3);
		System.out.println("result5:"+result5);
		
		myCalc.powerOff();
	}
}
