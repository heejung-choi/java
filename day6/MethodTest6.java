package day6;

public class MethodTest6 {

	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		System.out.println(add(10,100));
		System.out.println(add(10,20,30));
		System.out.println(add(new int[]{10,20,30,40})); //add처리하고자 하는 것이 많으면 배열로 처리한다.
		System.out.println(add(new int[]{1,2,3,4,5,6,7}));
		System.out.println(add());
		System.out.println(add(10,20,30,40,50));
		System.out.println(add(11));		
		System.out.println("main() 수행종료");
	}
	
	static int add(int p1, int p2) {
		return p1+p2;
	}
	
	static int add(int p1, int p2, int p3) {
		return p1+p2+p3;
	}
	/*static int add(int[]p) {
		int sum=0;
		for(int i=0; i<p.length; i++)
			sum +=p[i];
		return sum;
	}*/
	
	static int add(int...p) {
		int sum=0;
		for(int i=0; i<p.length; i++)
			sum +=p[i];
		return sum;
	}


}
