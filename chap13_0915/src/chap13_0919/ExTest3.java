package chap13_0919;

public class ExTest3 {

	public static void parse(String str) {
		try {
			float f=Float.parseFloat(str);
		} catch (NumberFormatException e) {
			f=0;
		}finally {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		parse("korea");

	}

}
