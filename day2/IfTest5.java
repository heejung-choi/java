package day2;

public class IfTest5 {

	public static void main(String[] args) {
	
	int score= (int)(Math.random()*101);
		
	if(score >=90) {
		System.out.print(score + ": A");
		if(score >= 97)
		System.out.println("+���");
		else if(score >=94)
			System.out.println("0���");
		else
			System.out.println("-���");
	}
	else if(score >=80) //&& score 90�� ���ʿ䰡 ���� �̹� ������ üũ�ϰ� �����Ա� ������
	{
		System.out.print(score + ": B");
		if(score >=87)
		System.out.println("+���");
		else if(score >=84)
			System.out.println("0���");
		else
			System.out.println("-���");
	}else if(score >=70){
		System.out.print(score + ": C");
		if(score >=77)
		System.out.println("+���");
		else if(score >=74)
			System.out.println("0���");
		else
			System.out.println("-���");
	}
	else if(score >=60){
		System.out.print(score + ": D");
		if(score >=67)
		System.out.println("+���");
		else if(score >=64)
			System.out.println("0���");
		else
			System.out.println("-���");
	}
	else
		System.out.println(score + ": F���"); //else�� ���� ����� if���� �ѽ��� �ȴ�.
	System.out.println("��������!!");

	}
}
