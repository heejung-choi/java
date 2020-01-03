package day6;

public class MethodLab1 {

	public static void main(String[] args) {
		mothod('@', 3);
		System.out.println();
		mothod('%', 4);
		System.out.println();
		mothod('A', 5);
		System.out.println();
		mothod('°¡', 3);	
	}
	static void mothod(char munja, int num) {
		
		for(int i=1; i<=num; i++)
			System.out.print(munja);
		return;
		
	}
	

	}

