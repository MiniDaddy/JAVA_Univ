package chap08;

public class Car2 {
	String company="쉐보레";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	public Car2(){
		
	}
	
	//생성자2
	public Car2(String model) {
		this(model,"은색",250); //지 혼자 매개변수 3개인 생성자 4 호출
	}
	
	//생성자3
	public Car2(String model, String color) {
		this(model,color,250); //역시 지 혼자 매개변수 3개인 생성자 4 호출
	}
	
	//생성자4
	public Car2(String model, String color, int maxSpeed) { //공통 실행 코드 (항상 실행됨)
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
