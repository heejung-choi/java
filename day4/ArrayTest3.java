package day4;
public class ArrayTest3 {
	public static void main(String[] args) {
		int a1[] = {3, 10, 2, 9, 5, 11, 12, 1};
		int max;
		// a1 �迭������ �Ҵ�� �迭�� ����� �ִ�
		max = a1[0];
		for(int i=1; i < a1.length; i++)
			if(a1[i] > max)
				max = a1[i];
		System.out.println("�ִ� : "+max);
		int min;
		// a1 �迭������ �Ҵ�� �迭�� ����� �ּڰ�
		min = a1[0];
		for(int i=1; i < a1.length; i++)
			if(a1[i] < min)
				min = a1[i];
		
		System.out.println("�ּڰ� : "+min);
		
	}
}








