package day2;

public class SwitchLab1 {

	public static void main(String[] args) {
			
		int grade = (int)(Math.random()*6)+1;
		char data;
		
		switch(grade) {
		case 1 :
		case 2 :
		case 3 : 
			data = '��';
			break;
		default :
			data = '��';
		}
		System.out.println(grade + "�г��� "+ data+"�г��Դϴ�.");
	}
}