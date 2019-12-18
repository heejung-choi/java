# 20191217 예외처리(Exception handling)



## 오류처리

- 컴파일 오류: 구문오류, API사용 오류

- 실행 오류: 

  - 에러 - JVM 영역에서 발생하는 오류로서 치명적이라 JVM이 프로그램 실행을 중단시키고 callstack 정보를 화면에 출력해준다. 미리 예측하고 대비하는 코드를  작성 불가.

  - 예외 - 자바프로그램 영역에서 발생하는 실행오류로 다소 가벼운 잘못된 상황

    - 런타임 예외 - 발생원인이 프로그램 코드 - 버그 -예외 처리 선택
    - 일반 예외(not 런타임예외) - 발생 원인이 외부적인 요인이다. - 예외 처리 필수

    

### 예외 처리 방법

1. 적극적인 예외 처리

   ```java
   try{
       예외가 발생할수도 있는 코드
   
   }catch(처리해야 하는 예외 클래스의 변수 선언){
       처리 코드
   } finally{
       예외 발생 여부와 관계없이 마지막에 수행을 보장하는 코드
   }
   ```

2. 소극적인 예외 처리

메서드 헤더에 'throws 처리해야 하는 예외 클래스'절을 추가

```java
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
```



### 예외 발생

- throw 발생시키고자 하는 예외 클래스의 객체

  ```
  throw new IOException(["예외메시지"])
  ```

- 예외를 발생시키는 코드를 가지고 있는 메서드는 헤더 throws 절을 사용해서 이 메서드는 호출시 예외가 발생할 수도 있다는 것을 알려야 한다.



### 예외 발생 예제

```java
package day11;

public class ExceptionTest2 {

	public static void main(String[] args) {//오류처리를 해야하는 메소드 처리의 이해
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result= num1/num2;
			System.out.println("연산결과: "+result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2개 전달하세요!!");
		} catch (ArithmeticException e) {
			e.printStackTrace();//어떤 행에서 예외가 발생했는지 알고 싶을때
			/*예외가 발생할 때의 콜스텟 정보를 호출하세요
			 호출하면 결과 java.lang.ArithmeticException: / by zero
			at day11.ExceptionTest2.main(ExceptionTest2.java:10)로 나옴 */
			
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!");
			
			return;//메인메소드의 리턴은 JVM에게 돌아가겠다는 뜻으로 프로그램을 끝나겠다라는 것
			//return 했는데도 불구하고 finally 수행한다.
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("프로그램 아큐먼트로 숫자를 전달하세요!!");
		} finally {
			System.out.println("항상 수행!!");
		}		
		System.out.println("수행종료");
	}
}
```

예외 클래스는 Exception라는 부모 클래스가 있다. (Exception e)로 선언해도 된다. 그러나 첫번째 catch 블럭에 Exception e을 넣으면 에러가 난다. 조상일수록 아래에 자손일수록 위에 catch 블럭을 작성해야 한다.




- [java.lang.Exception](../../java/lang/Exception.html)
- - [java.lang.RuntimeException](../../java/lang/RuntimeException.html)
  - - [java.lang.IllegalArgumentException](../../java/lang/IllegalArgumentException.html)
    - - java.lang.NumberFormatException