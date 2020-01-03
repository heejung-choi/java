package day3;

public class WhileLab1 {
	public static void main(String[] args) {
	   int num1= (int)(Math.random()*6)+5;
		//*(max-min+1)+min 
	   System.out.println("[for 결과]");
		for(int n=1; n<=num1; n++) {
			System.out.println(n+"->"+n*n);	
		}
		System.out.println("[while 결과]");
		int n=1;
		while(n<=num1) {
			System.out.println(n+"->"+n*n);
			n++;
		}
	}
}
