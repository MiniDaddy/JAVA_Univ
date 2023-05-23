package chap10;

public class DmbPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone객체 생성
		DmbCellPhone dmbCP=new DmbCellPhone("java phone", "black", 10);
		
		//cellPhone 클래스부터 상속된 필드
		System.out.println("model : " + dmbCP.model);
		System.out.println("color : " + dmbCP.color);
		
		//DmbCellPhone 클래스 필드
		System.out.println("channel : " + dmbCP.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCP.powerOn();
		dmbCP.bell();
		dmbCP.sendVoice("Hello");
		dmbCP.receiveVoice("Hi");
		dmbCP.sendVoice("nice to meet you");
		dmbCP.hangUp();
		
		//dmbCellPhone 클래스의 메소드 호출
		dmbCP.turnOnDmb();
		dmbCP.changeChannelDmb(15);
		dmbCP.turnOffDmb();
	}
}
