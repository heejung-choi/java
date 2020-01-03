package day4;

public class WhileLab3 {
	public static void main(String[] args) {

		char num1;
		int num2;
		int num3=0;
		
	  	while(true) {
	  		num2= (int)(Math.random()*31);
	  			  		if(num2==0||num2>=27)
	  		break;
	  		else {
	  			num1=(char)(num2+64);
	  			System.out.println(num1+"("+num2+")");
	  			num3++;
	  		}
		}
	  	System.out.println("수행횟수는 "+num3+"번입니다.");
		
	}
}
