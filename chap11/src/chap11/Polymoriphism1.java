package chap11;

class Item{
	public int price;
}

class Noodle extends Item{
	public Noodle() {
		price=2500;
	}
	public String toString() {
		return "국수";
	}
}

class MixNoodle extends Item{
	public MixNoodle() {
		price=3000;
	}
	public String toString() {
		return "비빔국수";
	}
}

class Wodong extends Item{
	public Wodong() {
		price=2500;
	}
	public String toString() {
		return "우동";
	}
}

class Buyer{
	private int money;
	public Buyer(int money) {
		this.money=money;
	}
	public void buy(Item it, int count) {
		System.out.println(it+"을(를) "+count+"개 맛잇게 먹었습니다. (-"+it.price*count+"원)");
		money=money-it.price*count;
		System.out.println("잔고 >>> "+money+"원");
	}
}

public class Polymoriphism1 {

	public static void main(String[] args) {
		Buyer me=new Buyer(20000);
		me.buy(new Wodong(), 3);
		me.buy(new MixNoodle(), 1);
		me.buy(new Noodle(), 2);
		
	}

}
