package chap03;

import java.util.Scanner;

public class Casting_widening {

	public static void main(String[] args) {
		
		Scanner stdin=new Scanner(System.in);
		System.out.println("first : ");
		int first = stdin.nextInt();
		
		System.out.println("second : ");
		int second=stdin.nextInt();
		
		double avg1 = (first+second)/2;
		double avg2 = (first+second)/2.0;
		double avg3 = (first+second)/(float)2;
	}

}
