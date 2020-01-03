package day2;

public class RandomTest {

	public static void main(String[] args) {
		//System.out.println(Math.random()); // 0.0 <= n < 1.0 범위의 값중 하나
		
		double rand1=Math.random();
		System.out.println(rand1);
		double rand2 = rand1 * 100;
		System.out.println(rand2);
		int rand3 = (int)rand2;
		System.out.println(rand3);
		
		
		
		
		
		// rand1을 가지고 1부터 6사이의 난수를 만드는 식을 구현하여 
		// sixNum 변수에 담아 출력해보기
		int sixNum = (int)(rand1*6)+1;
		System.out.println(sixNum);
		
		// rand1을 가지고 1부터 45사이의 난수를 만든 식을 구현하여
		// lottoNum 변수에 담아 출력해보기
		int lottoNum = (int)(rand1*45)+1;
		System.out.println(lottoNum);

	}
}
