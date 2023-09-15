package chap13_0915;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int inputNum1=Integer.parseInt(sc.next());
			int inputNum2=sc.nextInt();
			System.out.println(inputNum1/inputNum2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println("해당 예외 : "+e);
//			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("첫 번째 수는 숫자만 입력하시오");
//			System.out.println("해당 예외 : "+e);
		} catch (InputMismatchException e) {
			System.out.println("두 번째 수는 숫자만 입력하시오");
//			System.out.println("해당 예외 : "+e);
		} catch(Exception e) {
			System.out.println("예외발생");
		}finally {
			System.out.println("Exit");
		}
	}

}
