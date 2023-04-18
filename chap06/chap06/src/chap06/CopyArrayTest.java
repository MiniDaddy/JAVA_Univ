package chap06;

public class CopyArrayTest {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		
		num2=num1; //배열 " 주소 " 통째로 복사
		num2[2]=200; //num2[2]요소 값 변경, num2은 num1로 주소값을 복사했으므로 num2[2] == num1[2]
		
		System.out.println("num1의 값들");
		for(int i:num1) {
			System.out.print(i+" ");
		}

		System.out.println("\nnum2의 값들");
		for(int i:num2) {
			System.out.print(i+" ");
		}
		
		
		
		int num3[] = {100,200,300};
		int num4[] = {400,500,600};
		
		for(int i=0; i<num3.length; i++) {
			num4[i]=num3[i]; //배열 " 요소 " 1개씩 복사
		}
		num4[2]=999; 
		
		System.out.println("\nnum3의 값들");
		for(int i:num3) {
			System.out.print(i+" ");
		}

		System.out.println("\nnum4의 값들");
		for(int i:num4) {
			System.out.print(i+" ");
		}
		
	}

}
