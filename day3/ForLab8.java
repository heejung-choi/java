package day3;

public class ForLab8 {
	public static void main(String[] args) {
		char alpa = 'A'; 
		
		for(int rowNum=1; rowNum<=5; rowNum++) {
			for(int colNum=1; colNum<=rowNum; colNum++)
				System.out.print(alpa++);
		System.out.println();
		}
		
		
	}

}
