package day5;

public class TwoArrayTest3 {

	public static void main(String[] args) {
	int nums[][]= {
					{10,20,30,40},
					{11,21,31,41},
					{12,22,32,42}
				};
	 int sum = 0;
	 for(int i=0; i<nums.length; i++) {
		 for(int j=0; j<nums[i].length;j++)
			 sum +=nums[i][j];
	 System.out.println("��ü �������� ��: "+sum);
	 int sumRow=0, sumCol=0;
	 //����������  �����͸� �ջ��Ͽ� sumRow�� ����}
	for(int col=0; col<nums[2].length; col++) {
		 sumRow+=nums[2][col];
	 System.out.println(sumRow);
	 }
	 // �ι�° ���� �����͸� �ջ��Ͽ� sumCol�� ����
	 
	 for(int row=0; row<nums[1].length; row++) {
		 sumCol+=nums[i][1];
	 System.out.println(sumCol);
	 }
		 
	}
	}
}
