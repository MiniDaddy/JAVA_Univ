package chap08;

public class Car1 {
	String company="쉐보레";
	String model;
	String color;
	int maxSpeed;
	
	public Car1() {
		
	}
	
	public Car1(String model) {
		this.model=model;
	}
	
	public Car1(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	public Car1(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
