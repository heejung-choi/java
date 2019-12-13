# 메서드 (Method)

- 수행코드(수행명령, 수행문장)를 정의하는 단위

- main도 메서드이다.

- 클래스 안애 정의된다.

- 하나의 클래스 안에는 0개 이상의 메서드가 정의될 수 있다.

- 메서드를 생성하는 방법

- 메서드를 사용하는 방법- 호출

  

### 메서드를 생성하는 방법

- 메서드명:
	
	> (1) 소문자로 시작하고 새로운 워드 등장시 첫 글자만 대문자로
	>
	> (2) 식별자 규칙(명명) 규칙 적용
	>
	> (3) 동사로 시작 
- 메서드 호출시 전달받을 데이터의 유무를 결정
	유: 몇 개, 어떤 타입 ------------> 매개변수 선언
- 호출된 후에 호출한 곳으로 값을 줄 것인지의 여부를 결정 -- 리턴값
 return 이라는 구문을 사용한다.


```java
[제어자] 리터값의 타입  메서드명([매개변수 선언]) {	//메서드의 헤더, 중괄호 이후는 메서드의 바디
	지역변수 선언:
	수행 문장.....
	[return 리턴값 ]//리턴값이 없는 메소드이면 리턴값 안써도 된다.
}
```

 ### 메서드를 사용하는 방법 - 호출 

(1) 기능
(2) 헤더를 보고 

```java
- 메서드 명
> 호출시 전달할 데이터(아규먼트)의 유무

> 리턴값의 유무에 따라서 리턴값을 사용

변수 = 식

result = System.out.println(); // 오류 리턴값이 없기 때문에
rand = Math.random();/ 리턴값이 있으므로 가능 R-value에 리턴값이 있어야 한다.
```

- 배열 타입의 매개변수를 선언하여 메서드 호출시 배열을 아규먼트로 전달받으면 전달받는 데이터의 갯수를 제한하지 않게 된다.

  

### 가변형 아규먼트

- java 5(jdk 1.5) 가변형 아규먼트 구문이 추가된다. 
  리턴타입 메서드명(int...p){ p를 배열로 사용한다. } 

  > ...(점이 세개 여야 한다.) 점들어간 것은 마지막 매개변수 여야 한다.	
  >  p를 배열이라고 생각하고 호출하면 된다.

- 메서드명(1,2,3), 메서드명(1,2,3,4,5)

- new int[0]
- [프로그램 아규먼트(명령행 데이터)] 교재 배열 뒷부분에서 다루고 있음
  프로그램을 수행 시작시키면서 최초의 한번만 전달 되는 데이터들을 의미
- main(String[]args)
  (Intger.parsInt(), Double.pasDouble() 를 이용해서 숫자로 변환하여 사용한다.

``` java
int sum=0;
for(int i=0; i<p.length; i++)
sum +=p[i];
return sum;
	}
```



### 생성자 메서드 (constructor)

- 클래스를 객체생성 할때 (=인스턴트 생성할때) 호출되는 메서드 이다.

  - new클래스명() // 생성자 메서드

- 모든 클래스는 1개 이상의 생성자 메서드를 가지고 있어야 한다.

- 클래스의 소스에 생성자 메서드가 정의되어 있지 않으면 컴파일러가 생성자 메서드를 만들어 준다

  

#### 생성자 메서드 정의 방법

1. 메서드명은 클래스명과 동일해야 한다.

2. 매개변수는 선택적이다. (오버로딩 가능하다.)

3. 리턴 값의 타입은 생략 한다.

4. 객체 생성시 수행해야 하는 기능 또는 

   객체 생성시 데이터를 전달받아서 멤버변수들의 값을 초기화 하는 기능으로 생성자 메서드를 사용한다.



### this

-  자신의 객체의 참조값을 의미하는 리터럴
- this.XXXX 나의 멤버 XXXX
- this() 메소드로 인식 
- this 가로 안쓰면 리터럴로 쓰인다.
- this(): 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
  -  생성자 메서드 내에서만 호출 가능
  - 생성자 메서드의 첫 행에서만 호출 가능
  - 동일 클래스내에 있는 다른 생성자를 호출

```java
Book2(String title, String autor, int price){
	this.title= title;//this란 java가 내장하고 있는 리터럴이다. 자기자신을 참조하는 리터럴
	//this는 용법이 두가지 있다.
	this.author= autor;
	this.price= price;	
```



int[]ary = new int[5];

product[] p = new product[5];

 [ 방법 1 ]

```java
 [ 방법 1 ]
  import day6.MethodLab3;
  class 클래스명 {
           main() 메서드 헤더 {
	int month = MethodLab3.getRandom(12);
       }
  }
```
  }

  [ 방법 2 ]

```java
class 클래스명 {
	main() 메서드 헤더 {
		int month = day6.MethodLab3.getRandom(12);
     }}
```

 ### [ static(정적, 고정) ]

  - 제어자
  - 멤버변수와 메서드 앞에 지정 가능하다.
  - static 을 설정한 멤버변수와 메서드는 객체생성을 하지 않아도 자동으로 
     메모리 영역을 할당 하거나 호출 가능 가능한 상태가 된다.
  - 다른 클래스에서 또 다른 클래스의 static 타입의 멤버를 사용할 때는
    클래스명.멤버명 으로 사용한다.
  - 클래스에 정의되는 멤버들중 어떤 멤버에 static 부여 하는가?
     변수(멤버)
     메서드

### -verbose:class::classical_building:

: JVM 옵션

클래스 로딩 정보를 보여주면서 자바 프로그램을 수행시켜라!!

자바는 동적로딩이다. 필요할 때마다 로딩한다. //메모리를 효율적으로 쓰는 것



### 블럭스코프

```java
메서드 헤더{
int a; // a라는 변수는 현재 블럭이 끝날때 까지 유효하다. if문 안에서도 쓸수 있고 밑에서도 쓸 수 있다.
// int b; 여기에 선언하면 문제가 된다.

if(...){
	int b;//b는 선언된 위치로부터 해당되는 블럭이다.
}
int c;// 선언된 위치부터 아래까지 이다.
int b;// 여기에 선언해도 문제가 되지 않는다.
}
//항상 지역변수는 선언된 위치로부터 아래까지 쓸 수 있다.
```



### 표준입력

- 프로그램이 수행하는 동안 필요로 하는 데이터를 시스템의 표준 입력 장치로부터 받아오는 것
- 표준 입력 장치 - 키보드
- 표준 출력 -> System.out
- java에서는 표준 입력을 어떻게 처리하느냐.. -> System.in
  
- System.in.read() // 가장 표준 입력 메서드이나, 한글을 깨트리는 단점이 있다.
  
- java5 (JDK 1.5)

  - java.util.scanner 클래스를 제공하여 좀더 편하게 데이터를 입력받을 수 있게 

    API를 추가했다.

```java
Scanner scan = new Scanner(System.in)
scan.next()
scan.nextLine()
scan.nextInt()
scan.nextDouble();
```



![image-20191212151620824](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191212151620824.png)



입력하고 나서 시간을 주는것을 쿡드 모드 라고 한다.



### 실행오류

```
Exception in thread "main" java.util.InputMismatchException
//Exception 가벼운 오류
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at day8.ScannerTest3.main(ScannerTest3.java:7)
```



### Scanner

next(). nextInt(), nextDouble(), nextLine()

readLine([매개변수]):String

aaa bbb  ccc ddd\n

aaa\n

bbb\n

ccc\n

ddd\n