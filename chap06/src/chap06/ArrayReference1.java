package chap06;

public class ArrayReference1 {

	public static void main(String[] args) {
		int[] intArray=null;
		intArray[0]=10; //참조객체 없음
		
		String strVal1="java";
		String strVal2="java";
		
		if(strVal1==strVal2) {
			System.out.println("strVal1, strVal2 are same reference");
		}else {
			System.out.println("strVal1, strVal2 are different reference");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1, strVal2 are same String");
		}
		
		String strVal3=new String("jkm");
		String strVal4=new String("jkm");
		if(strVal3==strVal4) {
			System.out.println("strVal3, strVal4 are different reference");
		}else {
			System.out.println("strVal3, strVal4 dare different reference");
		}
		
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3,strVal4 are same thing");
		}
		
		
	}

}
