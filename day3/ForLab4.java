package day3;

public class ForLab4 {

	public static void main(String[] args) {
		int num1= (int)(Math.random()*(10-4))+3;				
		int num2= (int)(Math.random()*3)+1;
	//*(max-min+1)+min
		
		for(int n=0; n<=num1; n++){
			if(num2 == 1)
				System.out.print("*");
			else if(num2 == 2)
				System.out.print("$");
			else
				System.out.print("#");
			}
			
	}
	}
