package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int [][] emp = {
				{10, 20, 30, 40, 50},
				{5, 10, 15},
				{11, 22, 33, 44},
				{9, 8, 7, 6, 5, 4, 3, 2, 1}
				};
	
		int sum1=0,sum2=0,sum3=0,sum4=0;
		
		for(int row=0;row<emp.length;row++) {
			for(int col=0;col<emp[row].length;col++) {
				if(row==0)
					sum1+=emp[row][col];
				else if(row==1)
					sum2+=emp[row][col];
				else if(row==2)
					sum3+=emp[row][col];
				else
					sum4+=emp[row][col];
				
				/* int sum[]=new [4];
				   for (int i=0; i<array.length; i++){
				   		for (int j=0; j<array[i].length: j++)
				   				sum[i]+=array[i][j];
				   				System.out.println(i+1 +"���� ����"+ sum[i]+"�Դϴ�.");}
				  */
			}
						
		}
		System.out.println("1���� ����"+sum1+"�Դϴ�.");
		System.out.println("2���� ����"+sum2+"�Դϴ�.");
		System.out.println("3���� ����"+sum3+"�Դϴ�.");
		System.out.println("4���� ����"+sum4+"�Դϴ�.");
	}

}
