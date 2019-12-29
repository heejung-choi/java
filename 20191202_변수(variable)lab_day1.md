# 20191202_변수(variable)lab_day1

# 문제 1

다음에 제시된 세 개의 정수데이터(리터럴)를 
변수를 선언하여 저장하고 합계와 평균을 
구하여 제시된 출력 형식과 같이 출력하는 프로그램을 작성하시오. 
(평균의 소수 이하는 고려하지 않는다.)

작성 클래스명 : Exercise1

10, 25, 33

[ 출력 형식 ]

합계 : 68
평균 : 22



# 답안

```java
package day1;

public class Exercise1 {

	public static void main(String[] args) {
		int a=10;
		int b=25;
		int c=33;
		int sum= a+b+c;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/3);
	}
}
```



# 문제 2

다음에 제시된 두 개의 정수데이터(리터럴)를 
변수를 선언하여 저장하고 
나눈 몫과 나머지를 구하여 제시된 출력 형식과 같이 
출력하는 프로그램을 작성하시오. 

작성 클래스명 : Exercise2

35, 10

[ 출력 결과 ]

35 를 10 으로 나눈 결과 몫은 3 이고 나머지는 5 입니다.   

```java
package day1;

public class Exercise2 {

	public static void main(String[] args) {
		int a=35;
		int b=10;
		int c=(a/b);
		int d=(a%b);
	
		System.out.println(a+"를 "+b+"으로 나눈 결과 몫은 "+c+" 이고 나머지는 "+d+" 입니다.");
	
	}

}

```




실습 3

1. char 타입의 변수 name1, name2, name3 를 선언하고 본인 
   이름의 각 문자들을 문자 리터럴로 만들어 각각 저장한다.
2. 이름을 하나의 행에 출력한다.  

작성 클래스명 : Exercise3

```java
package day1;

public class Exercise3 {

	public static void main(String[] args) {
		char name1='최';
		char name2='희';
		char name3='정';
		System.out.println(""+name1+name2+name3); // 행을 바꾸는 것
		System.out.print(name1); // 행 바꾸지 않은 것
		System.out.print(name2);
		System.out.print(name3);

	}
}
```



# 문제 4

(문제에서 요구되는 변수들외에는 추가로 선언하지 않는다.)

1. int 타입의 변수 number 를 선언하고 100 이라는 값을 저장한다.
2. int 타입의 변수 result 를 선언한다.

3. number 변수의 값에 10을 더하고 결과를 result 에 담아 
   결과를 출력한다.    출력형식 : 덧셈 연산의 결과 - 110

4. number 변수의 값에 10을 빼고 결과를 result 에 담아 
   결과를 출력한다.    출력형식 : 뺄셈 연산의 결과 - 90

5. number 변수의 값에 10을 곱하고 결과를 result 에 담아 
   결과를 출력한다.    출력형식 : 곱셈 연산의 결과 - 1000

6. number 변수의 값에 10을 나누고 결과를 result 에 담아 
   결과를 출력한다.	  출력형식 : 나눗셈 연산의 결과 - 10

작성 클래스명 : Exercise4

```
package day1;

public class Exercise4 {

	public static void main(String[] args) {
		int number=100;
		int result= number + 10;
		System.out.println("덧셈 연산의 결과"+" - "+result);
		result =number -10;
		System.out.println("뺄셈 연산의 결과"+" - "+result);
		result=number*10;
		System.out.println("곱셈 연산의 결과"+" - "+result);
		result=number/10;
		System.out.println("나눗셈 연산의 결과"+" - "+result);
	}

}
```

