/*final 필드 선언 초기화
 * 
 */
package chap09_1;

public class Person {
	final String nation="Korea"; //선언 시 초기화
	final String ssn; //생성자로 초기화
	String name;
	
	public Person(String ssn, String name) {
		this.ssn=ssn;
		this.name=name;
	}
}
