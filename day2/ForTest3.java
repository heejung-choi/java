package day2;
public class ForTest3 {
	public static void main(String[] args) {
		for(int num=1;num<=20;num++) 
			//for문에서 num변수를 선언하면  for문내에서만 사용할 수 있다.
			System.out.print(num+"");
		System.out.println();
		for(int num=20;num>=1;num--)
			System.out.print(num+"");
		System.out.println();
		for(int num=20;num>=1;num-=3)
			System.out.print(num+"");
		System.out.println();
		for(int num=10;num>=1;num-=3)
			System.out.print(num+"");
		System.out.println();
		// System.out.print(num); 각각의 for문에서만 사용할 수 있기 때문에 오류가 난다.
		int num;
		for(num=10;num>=1;num-=3)
			System.out.print(num+"");
		System.out.println();
		System.out.print(num); //for문 밖에 변언을 선언하면 for문 밖에서도 변수를 사용할 수 있다.
	
	}

}
