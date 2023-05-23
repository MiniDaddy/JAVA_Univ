package chap10;

public class SuperSonicAirplaneEx {

	public static void main(String[] args) {
		SuperSonicAirplane ssa=new SuperSonicAirplane();
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode=SuperSonicAirplane.SUPERSONIC;
		ssa.fly();
		ssa.flyMode=SuperSonicAirplane.NORMAL;
		ssa.fly();
		ssa.land();

	}

}
