package chap08_1;

public class Rectangle_Test {

	public static void main(String[] args) {
		Rectangle myCalc=new Rectangle();
		double result1=myCalc.areaRectangle(10);
		double result2=myCalc.areaRecangle(10, 20);
		
		System.out.println("정사각형 : "+result1); 
		System.out.println("직사각형 : "+result2);
	}

}
