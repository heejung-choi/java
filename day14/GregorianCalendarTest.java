package day14;
import java.util.*;
public class GregorianCalendarTest {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));	// ������ 1���� �󸶳� �ƴ���
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));	// �̹��޿��� ��° �ֳ�
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));	// �̹��ֿ��� ��ĥ�̳�
		
		System.out.printf("%tY\n", gc);	// �빮�� Y�� ������ 4�ڸ��� ������
		System.out.printf("%ty\n", gc);	// �ҹ��� y�� ������ 2�ڸ��� ������
		System.out.printf("%tm\n", gc); // �ҹ��� m�� ���� ��Ÿ��
		System.out.printf("%tb\n", gc);	// �ҹ��� b�� ���� ���̶�� ������ ���
		System.out.printf("%tH\n", gc);	// �빮�� H �ð�
		System.out.printf("%tM\n", gc);	// �빮�� M ��
		System.out.printf("%tS\n", gc);	// �빮�� S ��
		System.out.printf("%tA\n", gc);	// �빮�� A ���ϱ��� ��Ÿ��
		System.out.printf("%ta\n", gc);	// �ҹ��� a ���ϸ� ��Ÿ��
	}
}
