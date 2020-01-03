package day3;

public class ForLab6 {
	public static void main(String[] args) {
		final char RANDOM = '&'; 
		int num= (int)(Math.random()*6)+5;
		//*(max-min+1)+min 
		for(int rowNum=1; rowNum<=num; rowNum++) {
			for(int colNum=1; colNum<=rowNum; colNum++)
				System.out.print(RANDOM);
		System.out.println();
		}
		
		
	}

}
