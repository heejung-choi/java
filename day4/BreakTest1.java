package day4;

public class BreakTest1 {
	public static void main(String[] args) {
	boolean flag = false;
	  for(int dan=1; dan<=9; dan++) {
		for(int num=1; num<=9; num++) {
			if(dan*num>30) {//break���� ���� ����� �ݺ��� �ϳ��� ����������.(��ø�� �ݺ����� ���ؼ�)
				flag =true;
				break;		
		}
			System.out.print(dan+ "x"+ num+"="+dan*num+"\t");//\t ��
		}
		
		
		System.out.println();
		if(flag)// if�� ���ξȿ��� ���ǽ��� �ִ´�-> �������� boolean���� �Ǵ� ���̸�
			//�ƿ� ���ǽ� �ȿ� flag�� �־ �ȴ�.(flag==true),(flag) ������
			break;
		}
	  
	  
	  System.out.println("������ ��� ����!!!");
	  
		
	}

}
