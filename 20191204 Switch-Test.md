# Switch-Test 20191204

## Test 1

```java
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
```

## Test 2

```java
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
```

## Test 3

```java
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

```

## Test 4

```java
package day2;

public class SwitchLab1 {

	public static void main(String[] args) {
			
		int grade = (int)(Math.random()*6)+1;
		char data;
		
		switch(grade) {
		case 1 :
		case 2 :
		case 3 : 
			data = '저';
			break;
		default :
			data = '고';
		}
		System.out.println(grade + "학년은 "+ data+"학년입니다.");
	}
}
```

## Test 5

```java
package day2;
public class SwitchLab2 {
	public static void main(String[] args) {
		int value = (int)(Math.random()*5)+1;
		int su1=300;
		int su2=50;
		int result=0;
		
	switch(value) {
	case 1: result=su1+su2;
	break;
	case 2: result=su1-su2;
	break;
	case 3: result=su1*su2;
	break;
	case 4: result=su1/su2;
	break;
	default:result=su1%su2;
	}
	 System.out.println("결과값:"+result);
	}

}
```

