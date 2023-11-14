package chap16_1114;

class Box<T>{
	T vol;
	void setVolume(T v) {
		vol=v;
	}
	
	T getVolume() {//부피 갖고오기
		return vol; 
	}
	
	
}


public class GenericsTest1 {
	public static void main(String[] args) {
		Box<Integer>iBox=new Box<Integer>(); //Integer형 Box인 iBox 생성
		iBox.setVolume(30);
		System.out.println(iBox.getVolume());
		
		Box<Double>iBox2=new Box<Double>(); //Double형 Box인 iBox 생성
		iBox2.setVolume(30.0);
		System.out.println(iBox2.getVolume());
	}

}
