package day2;
public class ForTest3 {
	public static void main(String[] args) {
		for(int num=1;num<=20;num++) 
			//for������ num������ �����ϸ�  for���������� ����� �� �ִ�.
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
		// System.out.print(num); ������ for�������� ����� �� �ֱ� ������ ������ ����.
		int num;
		for(num=10;num>=1;num-=3)
			System.out.print(num+"");
		System.out.println();
		System.out.print(num); //for�� �ۿ� ������ �����ϸ� for�� �ۿ����� ������ ����� �� �ִ�.
	
	}

}
