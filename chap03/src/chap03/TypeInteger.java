package chap03;

public class TypeInteger {

	public static void main(String[] args) {
		int var1 = 0b1011;
		int var2 = 0xB3;
		int var3 = 356;
		
		byte var4 = -128;
//		byte var5 = 128;   byte ㅡ> -128 ~ 127
		
		long var6 = 10000000000L;  //정수값이 int타입 허용 범위 밖인 경우 L 붙여야함
		
		char c1='A';
		char c2=65;
		char c3='\u0041';
	
		String name = "JKM";
		String str1 = "I like \"java\"";
		String str2 = "number\t"+name+"\tage";
		
		System.out.println(str2);
	}

}
