/*메소드 오버로딩
 * -같은 이름의 메소드 여러개선언
 * -메소드 오버로딩의 조건은 매개변수의 타입, 개수, 순서 중 하나라도 달라야 한다.
 * -리턴 타입 상관 없다
 * -jvm은 일차적으로 매개변수 타입을 보고, 매개변수 타입이 일치하지 않는 경우 자동 타입 변환이 가능한지 검사한다.
 * */
package chap08_1;

public class Rectangle {
	
	//필드
	
	//생성자
	
	//메소드(오버로딩)
	
	double areaRectangle(double width) { //정사각형
		return width * width;
	}
	
	double areaRecangle(double width, double height) { //직사각형
		return width * height;
	}
}
