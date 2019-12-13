# 변수 (variable)

### 데이터 타입 (29페이지)

#### 숫자데이터

- 정수: (byte(1바이트-128~127), short(2바이트):c언어와 호환을 위해 , int(4바이트), long(8바이트), 

- 실수: (floot(4바이트), double(8바이트)) 

  - ex) 1(정수) / 1.0(실수) / '1'(문자) / "1"(문자열) -> 서로 다른 의미
    1+1
    1.0+1
    '1'+1
    "1"+1 
    결과 값이 다 다르다.

    ```
    System.out.println(1+1);   //2  정수형
    System.out.println(1.0+1); //2.0 실수형 1.0+1.0->2.0
    System.out.println('1'+1); //50 문자형   1이라는 문자의 값
    ```

  - 자판의 키마다 코드값을 정해놓고 컴퓨터에게 인식하게 했다-> ASCII Code
    1을 코드값으로 49로 인식한다. 
    10진수 값으로 49System.out.println("1"+1); //11 문자열형 "1"+1 -> "1"+"1"->"11"

    ```
    System.out.println("123"+4);
    System.out.println(7777777777777L); //대문자 L을 붙이면 long형으로 바꾸라는것이다. // int형을 벗어남
    ```

#### 논리데이터

- (숫자가 없고, t/f 밖에 없다) true, false
  문자데이터-문자의 코드값 처리할 수 있는 타입, 2바이트, '1'- 0031 'a' - 0061 '가' - AC00
  문자열데이터- 객체로 취급, "ABC", "가나다", "123","###", "" // 내용물이 없는것도 문자열

  

#### 리터럴(literal): 프로그램 소스 코드에서 사용되는 데이터값

1, 1.0, '1', "1", "가" "가나다", "java", true, false 
-> 형이 다를뿐(문자형, 정수형 등등) 다 리터럴이다.
-> 문자형 리터럴을 만들고 싶을때는 '가나다' 이렇게 하면 안되고 "가나다" 이렇게 문자 리터럴로 만들어줘야 한다.
-> 그러나 리터럴만 가지고 프로그래밍을 할 수는 없다. 

``` package day1;
public class VariableTest {
	public static void main(String[] args) {
		System.out.println(1+2+3+4+5+10); //25
		System.out.println(1+2+3+4+5-10); //5
		System.out.println(1+2+3+4+5*10); //60
		System.out.println((1+2+3+4+5)*10); //곱셈연산자가 우선순위지만 괄호를 통해 우선순위를 선택할 수 있다.
		System.out.println(1+2+3+4+5/10); //10 : 5나누기 10은 몫이 0이기 때문에 0
		System.out.println("-------");
		int result = 1+2+3+4+5; //result :변수라고 한다. 12345를 리터널이라고 한다.
		System.out.println(result+10);
		System.out.println(result-10);
		System.out.println(result*10);
		System.out.println(result/10);
		}
}
```

#### 변수: 데이터 값을 저장하는 메모리의 방

- 변수명 : 규칙 - 소문자로 시작, 주로 명사를 사용, 길이 제한은 거의 없다. (65535자까지 가능)
  -  숫자로 시작 불가, 특수문자 중에는 _와 $ 기호만 가능
  - sum, avg, name, adress, phoneNumber (두번째 문자는 대문자로)

- 타입 변수명 = 식;

  ```
  int result = number + 10; // 변수 생성과 초기화
  result =number -10; // 변수에 값을 대입(할당, 치환, 대체)	
  result=number*10; // 변수에 값을 대입(할당, 치환, 대체)
  ```