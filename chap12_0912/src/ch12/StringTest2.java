package ch12;

public class StringTest2 {

	public static void main(String[] args) {
		String s1="JAVA KOREA";
		String s2=new String("JAVA KOREA");
		String s3=s2.intern();
		String s4="JAVA KOREA";
		String s5=new String("JAVA KOREA");
		System.out.println("s1과 s2가 같은 장소? >> "+(s1==s2));
		System.out.println("s1과 s2가 같은 값? >> "+(s1.equals(s2)));
		System.out.println("s1과 s3가 같은 장소? >> "+(s1==s3));
		System.out.println("s2과 s5가 같은 장소? >> "+(s2==s5));
		System.out.println("s2과 s5가 같은 값? >> "+(s2.equals(s5)));
	}

}
