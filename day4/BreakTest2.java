package day4;

public class BreakTest2 {
	public static void main(String[] args) {
	
	  unico: for(int dan=1; dan<=9; dan++) {//�ݺ����� ���� �ٿ���.
		for(int num=1; num<=9; num++) {
			if(dan*num>30) {//break���� ���� ����� �ݺ��� �ϳ��� ����������.			
				break unico ; //break���� ���� �� �� �ִ�.
				}
			System.out.print(dan+ "x"+ num+"="+dan*num+"\t");//\t ��
			}
		System.out.println();
		
		} 
	    System.out.println("������ ��� ����!!!");
		
	}

}
