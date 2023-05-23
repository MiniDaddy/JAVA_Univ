package chap10;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model=model; //상속받은 필드
		this.color=color; //상속받은 필드
		this.channel=channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("channel "+channel+" DNB Start receiving broadcast.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("channel "+channel+" change.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB End of broadcast reception.");
	}
}
