package day4;

public class BreakTest2 {
	public static void main(String[] args) {
	
	  unico: for(int dan=1; dan<=9; dan++) {//반복문에 라벨을 붙였다.
		for(int num=1; num<=9; num++) {
			if(dan*num>30) {//break문은 가장 가까운 반복문 하나만 빠져나간다.			
				break unico ; //break에는 라벨을 줄 수 있다.
				}
			System.out.print(dan+ "x"+ num+"="+dan*num+"\t");//\t 탭
			}
		System.out.println();
		
		} 
	    System.out.println("구구단 출력 종료!!!");
		
	}

}
