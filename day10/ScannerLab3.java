package day10;

import java.util.Scanner;

public class ScannerLab3 {
	//while(munja <= '��') {
	public static void main(String[] args) {		
		System.out.println();
		Scanner sc = new Scanner(System.in);//System.in�� static ������ �ڵ� �ʱ�ȭ �ȴ�./ ǥ�� �Է���ġ�� �Է��ϰ� �ʱ�ȭ �ȴ�.
		int su3=1;
		while(su3 == 1) {		
		System.out.printf("ù��° ���ڸ� �Է��ϼ���: ");
		int su1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("�ι�° ���ڸ� �Է��ϼ���: ");
		int su2 = sc.nextInt();
		sc.nextLine();
		System.out.printf("������(+, -, *, /)�� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		//���ڿ� �����ڸ� �Է¹޾� ó���ϴ� ����� ����ڰ�
		//���Ҷ����� �ݺ��ϵ��� �ڵ� �߰�
		//��� ��� ����ڿ��� ��� �����ϰڴ����� ���� �޼����� ����ϰ�
		//1�� �Է��ϸ� ��� �����̰� 2�� �Է��ϸ� ����
		int result=0;
		switch(str) {
		case "+": result=su1+su2;		
		break;
		case "-": result=su1-su2;	
		break;
		case "*": result=su1*su2;		
		break;
		case "/": result=su1/su2;		
		}			
		if(str.equals("+")||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/')//str.equals("+")�� ����
		System.out.printf("%d�� %d��  %s�������� %s�Դϴ�.",su1,su2,str,result);
		else
			System.out.printf("+,-,*,/�� �Է��ϼ�");
		System.out.printf("��� �����Ͻðڽ��ϱ�? ��� �����ϰ� ������ 1�� �Է��ϼ��� : ");
		su3 = sc.nextInt();
		//if(sc.nextInt()!=1)
			//break
		}	
		sc.close();}

	
	
	}


