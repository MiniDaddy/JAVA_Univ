/***
 * 2023.04.18
 * 정광민
 * Calendar 클래스로 컴퓨터의 날짜,요일,시간 얻음
 * Calendar.getInstance() 
 * today는 스택에 생성, week은 힙에 생성, Week.SUNDAY 열거 상수가 참조하는 객체 번지
 * Week.SUNDAY와 today변수는 서로 같은 week에
 */
package chap06;

import java.util.Calendar;

import chap06.EnumWeek.Week;

public class EnumWeek2 {
	public static void main(String[] args) {
		Week today=null; //열거타입변수생성
		
		Calendar cal=Calendar.getInstance(); //캘린더 객체 열기
		int week=cal.get(Calendar.DAY_OF_WEEK); //일(1) ~ 토(7)까지 숫자 리턴
		
		switch(week) { //대입
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WEDNESADY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		default:
			System.out.println("error");
			break;
		}
		
		System.out.println("today is "+today);
		
		if(today==Week.SUNDAY) {
			System.out.println("쉬어라");
		}else {
			System.out.println("공부해");
		}
		
	}

}
