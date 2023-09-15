package ch12;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("korea")); //뒤에 추가한다
		System.out.println(sb2.append(sb1));
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb2.substring(5,9)); //5~9번째 문자 뜯어옴
		System.out.println(sb2.delete(5,10)); //5에서 10 전까지 없애버림
		System.out.println(sb2);
		System.out.println(sb1.reverse()); //뒤집는다

	}

}
