package day3;

public class ForLab3 {

	public static void main(String[] args) {
		int num1= (int)(Math.random()*10)+1;
		int num2= (int)(Math.random()*11)+30;
		//*(max-min+1)+min
		int sum=0;
		
		for(int n=num1; n<=num2; n++){
			if(n % 2 == 0) 
				sum = sum+ n;}
			System.out.println(num1+"부터 "+num2+" 까지 짝수의 합: "+sum);
	
	}
}
