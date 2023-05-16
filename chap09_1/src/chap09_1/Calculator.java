/*정적 멤버 이용 (static)
 * 
 */
package chap09_1;



public class Calculator {
	static double pi=3.14159; //정적 필드
	
	static int plus(int x, int y) { //정적 메소드
		return x+y;
	}
	
	static int minus(int x, int y) {//정적 메소드
		return x-y;
	}
}
