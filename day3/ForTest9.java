package day3;

public class ForTest9 {
	public static void main(String[] args) {
		final char DECO = '@'; 
		//final-> 상수: 초기화된 값이 고정되는 변수, 관례적으로 대문자로 한다.
		//final double PI=3.14;
		for(int rowNum=9; rowNum>=1; rowNum--) {
			for(int colNum=1; colNum<=rowNum; colNum++)
				System.out.print(DECO);
		System.out.println();
		}
		
		
	}

}
