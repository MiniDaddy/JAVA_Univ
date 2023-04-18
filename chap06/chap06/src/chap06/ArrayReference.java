/***
 * 2023.04.18
 * 정광민
 * 
 * ;참조타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 가짐
 * String << 클래스
 * String[] 배열은 각 항목에 문자열 아닌 ㄴString 객체의 번지를 가짐
 * String[] 배열간 문자 비교는 ==연산자 대신 equals()메소드 사용
 * 
 * null과 NullPointException
 * 참조변수의 ==연산과 equals 메소드
 */
package chap06;

import java.util.Arrays;

public class ArrayReference {

	public static void main(String[] args) {
		String[] strArray = new String[3]; // 배열생성
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2])); //두 문자열 비교
	}
}