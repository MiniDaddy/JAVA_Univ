package chap10;

class DA1{
	public double d1;
	public DA1() {
		System.out.println("DA1 묵시적 생성자");
		d1=10*10;
	}
}
class DA2 extends DA1{
	public double d2;
	public DA2() {
		System.out.println("DA2 묵시적 생성자");
		d2=10*10*10;
	}
}
class DA3 extends DA2{
	public double d3;
	public DA3() {
		System.out.println("DA3 묵시적 생성자");
		d3=10*10*10*10;
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		DA3 super1=new DA3();
		System.out.println("10의 2제곱 : "+super1.d1);
		System.out.println("10의 3제곱 : "+super1.d2);
		System.out.println("10의 4제곱 : "+super1.d3);
		DA2 super2=new DA2();
	}

}
