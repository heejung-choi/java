package day7;

public class MethodTest10 {
	public static void main(String[] args) {
		int p1[]= {20,10,14,30};
		System.out.println("p1 ������ ��: "+p1);
		//p1 ������ ��: [I@15db9742 4����Ʈ 16������ ��
		//updateArray1 �� ����Ǵ� ��쿡�� p1,p2�� ���� ���� ���� ���´�.
		//�̰��� �������� ��������� �θ���.
		printArray(p1);
		int[] result =updateArray1(p1);
		printArray(result);
		printArray(p1);
		System.out.println("--------------");
		updateArray2(p1);
		printArray(p1);
		//updateArray1 p1�� �����ϰ� �ִ� �迭�� �ٲ��� ������ updateArray2�� �迭�� �ٲ۴�.
		//updateArray2�� ���ͺ��ϴ�.
		
	}
	static void printArray(int[]p2) {//void ���ϰ��� ����.
		for(int d:p2)
			System.out.printf("%d",d);//%d 10�� ������ ���·� ���
		//printf�� ���˹��ڿ��� ���� ����Ѵ�.
		System.out.printf("\n");// \n�ٹٲ�
	
	
	}
	static int[]updateArray1(int[]p2){//���ϰ��� int�� �����Ǿ� �ִ� �迭�̴�.
		System.out.println("p2 ������ ��: "+p2);
		int[] result =new int[p2.length];
		for(int i=0; i<result.length; i++)//p2.length�� result.length�� ����
			result[i]=p2[i]*2;
		return result;
	}
	
	static void updateArray2(int[]p3){
		System.out.println("p3 ������ ��: "+p3);
		for(int i=0; i<p3.length; i++)
			p3[i]=p3[i]*2;//������ ����Ʈ���� ���ϱ� �Ͽ� �ٽ� ����Ʈ�� ������ �ִ�.
	}
}
