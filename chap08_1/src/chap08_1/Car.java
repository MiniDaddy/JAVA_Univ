/* 메소드 선언 시 리턴값이 있는 경우 반드시 리턴문을 이용해 리턴값 지정.
 * return문 이후 실행문은 실행안됨
 * return값 없는 메소드의 return타입은 void
 * void로 선언된 메소드에서 return문은 메소드를 강제종료 시킴
 */
package chap08_1;

public class Car {
	//필드변수
	int gas;
	int speed;
	
	//생성자
	
	
	//메소드
	void setGas(int gas) { //리턴값 없는 메소드 매개값 받아 gas 필드값 변경
		this.gas=gas;
	}
	
	boolean isLeftGas() { //리턴값 bool
		if(gas==0) {
			System.out.println("no gas");
			return false;
		}
		System.out.println("has gas");
		return true;
	}
	
	void run() { //리턴값 없는 메소드 gas값이 0이면 return문으로 메소드 강종
		while(true) {
			if(gas>0) {
				System.out.println("run.(remaining gas:"+gas+")");
				gas-=1;
			}else {
				System.out.println("stop.(remaining gas:"+gas+")");
				return; //메소드 실행 종료
			}
		}
	}
	
	
	int getSpeed() {
		return speed;
	}
	void keyTurnOn() {
		System.out.println("\nTurn on the key");
	}
	void run2() {
		for(int i=10; i<=50; i+=10) {
			speed=i;
			System.out.println("run.(speed per hour:"+speed+"km/h)");
		}
	}
	
	
}
