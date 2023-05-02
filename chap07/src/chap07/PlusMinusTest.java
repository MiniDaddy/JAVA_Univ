package chap07;

public class PlusMinusTest {

	public static void main(String[] args) {
		PlusMinus ob1=new PlusMinus();
		
		String ssum, sminus;
		ssum=ob1.plus(50,30); //plusminus 클래스의 plus 메소드 호출
		sminus=ob1.minus(50,30); //plusminus 클래스의 minus 메소드 호출
		
		System.out.println(ssum);
		System.out.println(sminus);

	}

}
