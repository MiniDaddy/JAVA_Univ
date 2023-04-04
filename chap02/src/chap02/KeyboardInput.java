/**
 * 2023.03.14
 * 세 개의 값을 입력 받아 문자열, 정수, 실수값으로 출력하는 프로그램
 * @author JKM
 */
package chap02;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 space로 구분하여 입력 : ");
		String name = stdIn.next(); //이름을 문자열로 입력
		int i = stdIn.nextInt(); //나이를 정수로 입력
		double d = stdIn.nextDouble();
//		System.out.println("이름 : " + name + ", 나이 : " + i + "세, 몸무게 : " + d + "kg");
		System.out.println(name+"씨의 나이는 "+i+"세이고");
		System.out.println("몸무게는 "+d+"kg입니다.");
		
		
		
	}

}
