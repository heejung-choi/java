package day2;

public class SwitchTest2 {

	public static void main(String[] args) {
	
	int month= (int)(Math.random()*12)+1;
	switch(month) { //��: ����, �����, ���ϰ��� �ִ� �޼����� ȣ���(int, string}
	case 12:
	case 1:
	case 2:	System.out.println(month + ": �ܿ�");
		break;
	case 3:
	case 4:
	case 5:	System.out.println(month + ": ��");
		break;
	case 6:
	case 7:
	case 8:	System.out.println(month + ": ����");
		break;
	default: System.out.println(month + ": ����");
			}	
	}

}
