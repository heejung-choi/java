package day3;

public class ForLab5 {

	public static void main(String[] args) {
		int evenNum=0;
		int oddNum=0;
		
		for(int n=1; n<=100; n++)
			if(n % 2 == 0) 
				evenNum= evenNum+n;
			else
				oddNum= oddNum+n;
		System.out.println("1���� 100������ ���ڵ� �߿���");
		System.out.println("¦���� ���� "+ evenNum+ "�̰�"  );
		System.out.println("Ȧ���� ���� "+ oddNum+ "�̴�."  );
		
			
	
	}
	}
