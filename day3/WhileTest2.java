package day3;

public class WhileTest2 {
	public static void main(String[] args) {
		int lottoNum;
		while(true) { 
			lottoNum = (int)(Math.random()*6)+1;
			if(lottoNum==3) {
				System.out.println("��÷!!������ : "+lottoNum);
			break;//�극��ũ�� �����ȿ����� ���� �� �ִ�.
			}else { 
				System.out.println("��õ�!!�ФФ� : "+lottoNum);
							
			System.out.println("��������....");
			
			}
		}
	}
	}

