package day3;

public class WhileLab2 {
	public static void main(String[] args) {
	   int pairNum1;
	   int pairNum2;
		//*(max-min+1)+min 
	  	while(true) {
	  		pairNum1= (int)(Math.random()*6)+1; // 반복문 안에서 변수선언하는 것은 지양한다.
	  		
	  		pairNum2= (int)(Math.random()*6)+1;
	  		if(pairNum1==pairNum2) 
	  			break;
	  		else if(pairNum1>pairNum2) {
	  			System.out.println("pairNum1이 pairNum2 보다 크다.");
	  			}
	  		else {
	  			System.out.println("pairNum1이 pairNum2 보다 작다");	
	  		}
		}
		System.out.println("게임끝");
	}
}


/*while(true) { 
	lottoNum = (int)(Math.random()*6)+1;
	if(lottoNum==3) {
		System.out.println("당첨!!ㅋㅋㅋ : "+lottoNum);
	break;//브레이크는 루프안에서만 사용될 수 있다.
	}else { 
		System.out.println("재시도!!ㅠㅠㅠ : "+lottoNum);
					
	System.out.println("수행종료....");
	
	}*/