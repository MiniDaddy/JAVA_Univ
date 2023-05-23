package chap10;

public class ComputerEx {

	public static void main(String[] args) {
		int r=10;
		Calculator calc = new Calculator();
		
		//calculator 객체의 원의 넓이
		System.out.println("circle area : "+calc.areaCircle(r));
		
		//computer객체의 원의 넓이
		Computer cpt=new Computer();
		System.out.println("cirlce area : "+cpt.areaCircle(r));
	}

}
