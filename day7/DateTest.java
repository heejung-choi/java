package day7;//��Ű���� Ŭ������ ���� �ٷ���

import java.util.Date; //�ٸ� ��Ű���� �ִ� ���� �����Ϸ��� �̷��� �ؾ��Ѵ�.
//��Ű�� �̸�: java.util Ŭ���� �̸�:Date
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		// �ڹٿ� Date Ŭ������ �ִ�.
		Date d = new Date();
		System.out.println(d.toString()); // ���� �ð������� �ý��������� ������ �ִ�.
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));// ������ ����
		// �Ұ�ȣ �پ��ִ� �͵� �޼ҵ� �Ⱥپ��ִ°͵� ����̴�. ��� �̸� ���϶��� �빮�ڷ� �Ѵ�.
		gc = new GregorianCalendar(2019, 11, 25);
		// �� �������� ���� ��ü�� �������� �ȴ�.// 12���� �Ϸ��� 12-1�� �ؼ� ��ȸ�ؾ� �Ѵ�.(���� �ݵ�� -1)
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc = new GregorianCalendar(1995, 9, 8);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}

}
