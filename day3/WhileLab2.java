package day3;

public class WhileLab2 {
	public static void main(String[] args) {
	   int pairNum1;
	   int pairNum2;
		//*(max-min+1)+min 
	  	while(true) {
	  		pairNum1= (int)(Math.random()*6)+1; // �ݺ��� �ȿ��� ���������ϴ� ���� �����Ѵ�.
	  		
	  		pairNum2= (int)(Math.random()*6)+1;
	  		if(pairNum1==pairNum2) 
	  			break;
	  		else if(pairNum1>pairNum2) {
	  			System.out.println("pairNum1�� pairNum2 ���� ũ��.");
	  			}
	  		else {
	  			System.out.println("pairNum1�� pairNum2 ���� �۴�");	
	  		}
		}
		System.out.println("���ӳ�");
	}
}


/*while(true) { 
	lottoNum = (int)(Math.random()*6)+1;
	if(lottoNum==3) {
		System.out.println("��÷!!������ : "+lottoNum);
	break;//�극��ũ�� �����ȿ����� ���� �� �ִ�.
	}else { 
		System.out.println("��õ�!!�ФФ� : "+lottoNum);
					
	System.out.println("��������....");
	
	}*/