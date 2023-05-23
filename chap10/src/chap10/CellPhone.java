package chap10;

public class CellPhone {
	//필드(멤버)
	String model;
	String color;
	
	//생성자
	
	
	//메소드
	void powerOn() {
		System.out.println("power on.");
	}
	
	void powerOff() {
		System.out.println("power off.");
	}
	
	void bell(){
		System.out.println("ring bell.");
	}
	
	void sendVoice(String message) {
		System.out.println("me: "+message);
	}
	
	void receiveVoice(String message) {
		System.out.println("you: "+message);
	}
	
	void hangUp() {
		System.out.println("end call.");
	}
	
}
