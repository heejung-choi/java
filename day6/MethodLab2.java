package day6;

public class MethodLab2 {

	public static void main(String[] args) {
		int num1=(int)(Math.random()*30)+1;
		int num2=(int)(Math.random()*30)+1;
		System.out.print(num1+"�� "+num2+"�� ���� ");
		mothod(num1, num2);
		System.out.print(" �Դϴ�.");
	}
	static void mothod(int num1, int num2) {
		if(num1>num2) 
		System.out.print(num1-num2);
		else if(num1<num2)
		System.out.print(num2-num1);
		else
	    System.out.print(0);	
		return;
		
	}
		
	}
	

	
