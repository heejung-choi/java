package day2;

public class IfTest1 {

	public static void main(String[] args) {
	
	int num = (int)(Math.random()*10);
	if(num % 2 == 0)
		// 비교식 참, 거짓일때 수행할 문장을 사용하고 싶으면 if문이라는 제어문을 사용한다.
		System.out.println(num + " : 짝수");
	else
		System.out.println(num + " : 홀수"); 

	}

}
