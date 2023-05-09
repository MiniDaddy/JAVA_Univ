/*클래스 외부에서 메서드 호출
 * 반드시 객체 생성 후 호출*/
package chap08_1;

public class Calc_Test {

	public static void main(String[] args) {
		Calculation myCalc=new Calculation();
		myCalc.execute();

	}

}
