package day2;

public class TimeTest {

	public static void main(String[] args) {
		
	int time = 32150;
	int a = time/360;
	int b = (time%360)/60;
	int c = time%360%60;
	System.out.println(a+"�ð� "+b+"�� "+c+"��");
	
	/*int time = 32150;
	int hour = time/3600;
	int min = time/60-hour60;
	int sec = time%60;
	System.out.println(hour+"�ð� "+min+"�� "+c+"sec");
	*/
	
	}
}
