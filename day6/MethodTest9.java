package day6;

public class MethodTest9 {

	public static void main(String[] args) {
		int size = MethodLab3.getRandom(3, 8);//Ŭ�����̸�.�޼ҵ�� 
		int p[] = new int[size];
		for (int i=0; i<p.length; i++)
			p[i]=MethodLab3.getRandom(20);
		for(int data:p)
			System.out.print(data+" ");
		System.out.println();//���θ޼ҵ��� p�� ���θ޼ҵ忡���� ���ǰ� iseven������ p�� �ű⼭�� ���ȴ�.
		boolean flag[] = isEven(p);
		
		for(boolean data:flag)
			//System.out.print(data+" ");
			System.out.print(data ?"¦�� ":"Ȧ��"+" ");//boolean�� ��쿡�� true�� �������� �� �ִ�(�񱳿�����)
		System.out.println();
	}
	//���޵� �迭�� ��Ұ����� ���� üũ�Ͽ�
	//¦���� true Ȧ���� false�� �����ϴ� boolean Ÿ�� �迭�� �����Ѵ�.
	//���޵� �迭�� ũ��� ������ ũ���� boolean Ÿ�� �迭�� �����Ͽ� ����
	static boolean[] isEven(int[]p) { //is ~�̳�?
		boolean[]result = new boolean[p.length];
		for(int i=0; i<p.length; i++)//for each���� ���� �Ǹ� �ε������� �� ������ ���� ����� ��� �Ѵ�.
			result[i] =p[i] % 2==0 ? true : false;//���׿�����
		return result;
		
	}

}
