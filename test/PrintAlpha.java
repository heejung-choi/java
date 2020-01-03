package test;

public class PrintAlpha {
	public static void main(String[] args) {
		char alpa = 'A'; 
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++)
				System.out.print(alpa++);
		System.out.println();
		}
		
		
	}

}