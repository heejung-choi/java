package day2;

public class IfTest5 {

	public static void main(String[] args) {
	
	int score= (int)(Math.random()*101);
		
	if(score >=90) {
		System.out.print(score + ": A");
		if(score >= 97)
		System.out.println("+등급");
		else if(score >=94)
			System.out.println("0등급");
		else
			System.out.println("-등급");
	}
	else if(score >=80) //&& score 90은 할필요가 없다 이미 위에서 체크하고 내려왔기 때문에
	{
		System.out.print(score + ": B");
		if(score >=87)
		System.out.println("+등급");
		else if(score >=84)
			System.out.println("0등급");
		else
			System.out.println("-등급");
	}else if(score >=70){
		System.out.print(score + ": C");
		if(score >=77)
		System.out.println("+등급");
		else if(score >=74)
			System.out.println("0등급");
		else
			System.out.println("-등급");
	}
	else if(score >=60){
		System.out.print(score + ": D");
		if(score >=67)
		System.out.println("+등급");
		else if(score >=64)
			System.out.println("0등급");
		else
			System.out.println("-등급");
	}
	else
		System.out.println(score + ": F등급"); //else는 가장 가까운 if문과 한쌍이 된다.
	System.out.println("수행종료!!");

	}
}
