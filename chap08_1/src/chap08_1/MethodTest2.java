package chap08_1;

public class MethodTest2 {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("car start.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("no need to inject gas");
		}else {
			System.out.println("inject gas");
		}
		
		myCar.keyTurnOn();
		myCar.run2();
		
		int speed=myCar.getSpeed();
		System.out.println("current speed:"+speed+"km/h");
		
	}
}
