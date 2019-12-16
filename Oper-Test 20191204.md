# Oper-Test 20191204

## Test 1

```java
package day2;

public class OperTest1 {
	public static void main(String[] args) {
		/*int num1 = 100;
		int num2 = 50;*/
		
		int num1=100, num2=50; //타입이 동일한 경우에 한해서 같은 행에 넣어서 선언해도 된다.
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1>num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>0 && num2>0);
		System.out.println(num1>80 && num2>80);
		System.out.println(num1>0 || num2>0);
		System.out.println(num1>80 || num2>80);
		System.out.println(num1>0 && num2>0 && num1 %2==0);
		System.out.println(num1>80 && num2>80 && num1 %2==1);		
		}
}
```

## Test 2

```java
package day2;

public class OperTest2 {
	public static void main(String[] args) {
		// 증감연산자: 증가연산자(++) 감소연산자(--)를 합쳐서 부르는 이름
	    int su1, su2, su3, su4;
	    su1 = 10;
		System.out.println(su1);//10
		System.out.println(++su1);//11
		System.out.println(++su1);//12
		System.out.println(++su1);//13
		System.out.println(--su1);//12
		
	    su2 = 10;
		System.out.println(su2); //10
		System.out.println(su2++);//10
		System.out.println(su2++);//11
		System.out.println(su2++);//12
		System.out.println(su2--);//13
		System.out.println(su2);//12
		
	    su3 = 10;
		System.out.println(su3); //10
		System.out.println(su3++);//10
		System.out.println(++su3);//12
		System.out.println(su3++);//12
		System.out.println(--su3);//12
		System.out.println(--su3);//11

		su4 = 10;
		System.out.println(su4); //10
		++su4;
		System.out.println(su4);//11
		su4++;
		System.out.println(su4);//12
		//++10; 이것은 안된다. 리터럴이라는 것은 값 변경이 안된다.
			
}
}

```

## Test 3

```java
package day2;

public class OperTest3 {
	public static void main(String[] args) {
	 int ivalue;
	 char cvalue;
	 double dvalue;
	 boolean bvalue;
	 
	 ivalue = 100;
	 cvalue = 'A';
	 dvalue = 3.14;
	 bvalue = true;
	 
	 System.out.println(ivalue);
	 System.out.println(cvalue);
	 System.out.println(dvalue);
	 System.out.println(bvalue);
	 
	 ivalue = cvalue;
	 System.out.println(ivalue);// 문자데이터를 십진수 값으로 바꿔 내보냄 //65
	 
	 /*ivalue = dvalue;
	 System.out.println(ivalue); 값이 더 작은것으로는 변환할 수 없음 */
	 
	 ivalue = (int)dvalue; //강제로 형변환하겠다는 뜻 -> 값이 손실되더라도 변환하갰다는 뜻
	 // 형변환 연산자라고 부름
	 System.out.println(ivalue);
	 
	/* ivalue = bvalue;
	 ivalue = (int)bvalue; 형변환에 boolean은 제외된다. 자동, 강제 형변환 둘다 안된다.*/


}
}

```

## Test 4 - RandomTest

```java
package day2;

public class RandomTest {

	public static void main(String[] args) {
		//System.out.println(Math.random()); // 0.0 <= n < 1.0 범위의 값중 하나
		
		double rand1=Math.random();
		System.out.println(rand1);
		double rand2 = rand1 * 100;
		System.out.println(rand2);
		int rand3 = (int)rand2;
		System.out.println(rand3);
		
		
		
		
		
		// rand1을 가지고 1부터 6사이의 난수를 만드는 식을 구현하여 
		// sixNum 변수에 담아 출력해보기
		int sixNum = (int)(rand1*6)+1;
		System.out.println(sixNum);
		
		// rand1을 가지고 1부터 45사이의 난수를 만든 식을 구현하여
		// lottoNum 변수에 담아 출력해보기
		int lottoNum = (int)(rand1*45)+1;
		System.out.println(lottoNum);

	}
}

```

## Test 5

```java
package day2;

public class TimeTest {

	public static void main(String[] args) {
		
	int time = 32150;
	int a = time/360;
	int b = (time%360)/60;
	int c = time%360%60;
	System.out.println(a+"시간 "+b+"분 "+c+"초");
	
	/*int time = 32150;
	int hour = time/3600;
	int min = time/60-hour60;
	int sec = time%60;
	System.out.println(hour+"시간 "+min+"분 "+c+"sec");
	*/
	
	}
}

```

