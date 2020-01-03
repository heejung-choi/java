package day4;

public class BreakTest1 {
	public static void main(String[] args) {
	boolean flag = false;
	  for(int dan=1; dan<=9; dan++) {
		for(int num=1; num<=9; num++) {
			if(dan*num>30) {//break문은 가장 가까운 반복문 하나만 빠져나간다.(중첩된 반복문에 한해서)
				flag =true;
				break;		
		}
			System.out.print(dan+ "x"+ num+"="+dan*num+"\t");//\t 탭
		}
		
		
		System.out.println();
		if(flag)// if문 가로안에는 조건식을 넣는다-> 연산결과가 boolean형이 되는 것이면
			//아예 조건식 안에 flag만 넣어도 된다.(flag==true),(flag) 동일함
			break;
		}
	  
	  
	  System.out.println("구구단 출력 종료!!!");
	  
		
	}

}
