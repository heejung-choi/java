package day6;

public class MethodLab3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==5)
				System.out.printf("%d%n",getRandom(10));
			else
				System.out.printf("%d, ",getRandom(10));
		}
		for(int i=1;i<=5;i++) {
			if(i==5)
				System.out.printf("%d%n",getRandom(10,20));
			else
				System.out.printf("%d, ",getRandom(10,20));
		}
		
	}
	public static int getRandom(int n) {
		return (int)(Math.random()*n+1);
	}
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1)+n1);
	}
}

/*package day6;

public class MethodLab3 {

	public static void main(String[] args) {
		getRandom(10);
		System.out.print(",");
		getRandom(10);
		System.out.print(",");
		getRandom(10);
		System.out.print(",");
		getRandom(10);
		System.out.print(",");
		getRandom(10);
		System.out.println();
		getRandom(10,20);
		System.out.print(",");
		getRandom(10,20);
		System.out.print(",");
		getRandom(10,20);
		System.out.print(",");
		getRandom(10,20);
		System.out.print(",");
		getRandom(10,20);
		
	}
	static void getRandom(int n)  {
		int random=(int)(Math.random()*n)+1;
		System.out.print(random);
		return;			
	}
	static void getRandom(int n1, int n2)   {
		int random=(int)(Math.random()*(n2-n1+1))+n1;
		System.out.print(random);
		return;		
	}
	}
	*/

	
