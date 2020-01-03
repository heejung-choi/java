package day2;

public class IfTest2 {

	public static void main(String[] args) {
	
	System.out.println("문장1");
	System.out.println("문장2");
	
	
	if((int)(Math.random()*10)+1>5) 
//if문 뒤에 세미콜론을 주면 if문에서 끝나버리기 때문에 else를 작성 못함
//else는 반드시 매핑되는 if가 있어야 한다.
		System.out.println("문장3");
	else {
		System.out.println("문장4");
	    System.out.println("문장5");
	}
	System.out.println("문장6");

	}

}
