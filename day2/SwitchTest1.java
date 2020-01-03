package day2;

public class SwitchTest1 {

	public static void main(String[] args) {
	
	int num = (int)(Math.random()*10);
	switch(num % 2) {
	case 0 : System.out.println(num + " : 짝수");
		break; //브레이크문을 넣으면 값에 해당하는 경우 멈출 수 있다.
	case 1 : System.out.println(num + " : 홀수"); 
	//default 절을 생략할 수 있다.

	}

}

}