package day2;

public class SwitchTest3 {

	public static void main(String[] args) {
	
	int score= (int)(Math.random()*101);
	//������ ����� ó���ǵ��� if���� ����ġ������ �����غ���.	
	
	switch(score/10){
	case 10: 
	case 9:	System.out.println(score + ": A���");
	break;
	case 8: System.out.println(score + ": B���");
	break;
	case 7:	System.out.println(score + ": C���");
	break;
	case 6:	System.out.println(score + ": D���");
	break;
	default: System.out.println(score + ": F���");
		}
	
    /*if(score >=90)
		System.out.println(score + ": A���");
	else if(score >=80) //&& score 90�� ���ʿ䰡 ���� �̹� ������ üũ�ϰ� �����Ա� ������
		System.out.println(score + ": B���");
	else if(score >=70)
		System.out.println(score + ": C���");
	else if(score >=60)
		System.out.println(score + ": D���");
	else
		System.out.println(score + ": F���"); //else�� ���� ����� if���� �ѽ��� �ȴ�.
	System.out.println("��������!!");
*/
	}

}
