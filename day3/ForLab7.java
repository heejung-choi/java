package day3;

public class ForLab7 {
	public static void main(String[] args) {
		final char STAR = '*'; 
		
		for(int rowNum=7; rowNum>=1; rowNum--) {
			for(int colNum=1; colNum<=rowNum; colNum++)
				System.out.print(STAR);
		System.out.println();
		}
		
		
	}

}
