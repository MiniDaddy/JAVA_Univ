/**
 * 2023.04.18
 * 정광민
 * arraycopy => system.arraycopy(str1,0,str2,0,len)
 * 				str1배열의 인덱스 0 ~ str2배열의 인덱스 0에 len만큼 복사
 * */
package chap06;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int num1[] = { 10, 20, 30 };
		int num2[] = { 40, 50, 60 };
		String str3[] = { "java", "array", "copy" };
		String str4[] = new String[5];

		// 배열 요소값들 복사
		for (int i = 0; i < num1.length; i++) {
			num2[i] = num1[i];
		}

		System.out.print("num2 value: ");
		for (int i : num2) {
			System.out.print(i + " ");
		}

		// copyarray로 복사
		System.arraycopy(str3, 0, str4, 0, 3); // str4는 길이가 5이므로 str3의 3개는 들어가지만 나머지 2개는 null 그대로 남음

		System.out.print("\nstr4 value: ");

		for (String value : str4) {
			System.out.print(value + " ");
		}

		String str5[] = Arrays.copyOf(str3, 2);

		System.out.print("\nstr5 value: ");

		for (String value : str5) {
			System.out.print(value + " ");
		}
	}

}
