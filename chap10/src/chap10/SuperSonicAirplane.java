package chap10;

public class SuperSonicAirplane extends Airplane{
	public static final int NORMAL=1; //상수 정의 시 static final
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("Supersonic Flight.");
		}else {
			super.fly();
		}
	}
}
