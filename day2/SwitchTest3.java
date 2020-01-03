package day2;

public class SwitchTest3 {

	public static void main(String[] args) {
	
	int score= (int)(Math.random()*101);
	//동일한 기느이 처리되도록 if문을 스위치문으로 변경해본다.	
	
	switch(score/10){
	case 10: 
	case 9:	System.out.println(score + ": A등급");
	break;
	case 8: System.out.println(score + ": B등급");
	break;
	case 7:	System.out.println(score + ": C등급");
	break;
	case 6:	System.out.println(score + ": D등급");
	break;
	default: System.out.println(score + ": F등급");
		}
	
    /*if(score >=90)
		System.out.println(score + ": A등급");
	else if(score >=80) //&& score 90은 할필요가 없다 이미 위에서 체크하고 내려왔기 때문에
		System.out.println(score + ": B등급");
	else if(score >=70)
		System.out.println(score + ": C등급");
	else if(score >=60)
		System.out.println(score + ": D등급");
	else
		System.out.println(score + ": F등급"); //else는 가장 가까운 if문과 한쌍이 된다.
	System.out.println("수행종료!!");
*/
	}

}
