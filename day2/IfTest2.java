package day2;

public class IfTest2 {

	public static void main(String[] args) {
	
	System.out.println("����1");
	System.out.println("����2");
	
	
	if((int)(Math.random()*10)+1>5) 
//if�� �ڿ� �����ݷ��� �ָ� if������ ���������� ������ else�� �ۼ� ����
//else�� �ݵ�� ���εǴ� if�� �־�� �Ѵ�.
		System.out.println("����3");
	else {
		System.out.println("����4");
	    System.out.println("����5");
	}
	System.out.println("����6");

	}

}
