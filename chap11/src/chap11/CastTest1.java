/*타입변환(casting)-(자동타입 변환) :
 * 1. 클래스의 타입 변환은 상속관계에서 발생
 * 2. 자식은 부모 타입으로 자동타입 변환 가능
 * 3. 바로 위 부모가 아니더라도 상속 계층에서 상위 타입이면 자동 타입 변환가능
 * 4. 
 * */
package chap11;

class Rectangle4{
	public int width;
	public int height;
	
	public Rectangle4(int w, int h) {
		width=w;
		height=h;
	}
	public int computeRectangleArea() {
		return width*height;
	}
}

class Cube4 extends Rectangle4{
	public int depth;
	public Cube4(int w, int h, int d) {
		super(w,h);
		depth=d;
	}
	public int computeCubeArea() {
		return super.computeRectangleArea()*depth;
	}
}



public class CastTest1 {	
	public static void main(String[] args) {
		Rectangle4 r = new Cube4(10,20,30);
		
		System.out.println("r은 Rectangle4의 객체? "+(r instanceof Rectangle4));
		System.out.println("r은 cube4의 객체? "+(r instanceof Cube4));
		System.out.println("r은 Object의 객체? "+(r instanceof Object));
		
		System.out.println();
		System.out.println("넓이는 : "+r.computeRectangleArea());
		
		
		Cube4 c=(Cube4) r;
		System.out.println("넓이는 : "+c.computeCubeArea());
	}
}
