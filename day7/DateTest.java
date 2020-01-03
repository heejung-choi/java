package day7;//패키지는 클래스를 묶는 꾸러미

import java.util.Date; //다른 패키지에 있는 것을 접근하려면 이렇게 해야한다.
//패키지 이름: java.util 클래스 이름:Date
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		// 자바에 Date 클래스가 있다.
		Date d = new Date();
		System.out.println(d.toString()); // 현재 시간정보와 시스템정보가 나오고 있다.
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));// 오늘의 요일
		// 소괄호 붙어있는 것들 메소드 안붙어있는것들 상수이다. 상수 이름 붙일때는 대문자로 한다.
		gc = new GregorianCalendar(2019, 11, 25);
		// 이 시점에서 위의 객체는 가비지가 된다.// 12월을 하려면 12-1을 해서 조회해야 한다.(월은 반드시 -1)
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc = new GregorianCalendar(1995, 9, 8);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}

}
