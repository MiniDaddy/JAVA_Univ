package chap16_1107;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now(); //날짜관련 클래스
		LocalTime time=LocalTime.now(); //시간관련 클래스
		LocalDateTime dateTime=LocalDateTime.now(); //현재날짜시간 관련 클래스
		
//		System.out.println(date+"\n"+time+"\n"+dateTime);
		
		String s=dateTime.getYear()+"년\n";
		s+=dateTime.getMonthValue()+"월\n";
		s+=dateTime.getDayOfMonth()+"일\n";
		s+=dateTime.getDayOfWeek()+"\n";
		s+=dateTime.getHour()+"시\n";
		s+=dateTime.getMinute()+"분\n";
		s+=dateTime.getSecond()+"초\n";
		
		System.out.println(s);
		
		System.out.println(date.plusDays(100)); //100일 뒤
		System.out.println(date.plusWeeks(10)); //10주 뒤
	}

}
