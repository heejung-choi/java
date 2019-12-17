# 인터페이스(interface)

- 클래스. final 클래스, abstract 클래스
- 인터페이스는 모든 메서드가 abstract 메서드인 클래스를 의미한다.
- 자바는 단일 상속을 지원하는 OOP 언어이다.
- 모든 메서드가 abstract인 클래스를 상속한 경우 다른 클래스는 상속 불가
  - 이것을 개선하기 위한 것이 인터페이스

- 인터페이스는 추가 상속이 가능한 특별한 형태의 클래스이다.(다중 상속 지원)
- 인터페이스는 abstract 클래스와 비슷한 자바 프로그램의 구조로서 객체 생성은 불가하고 상속으로만 사용이 가능하다.



### 인터페이스 생성 방법

```java
interface 인터페이스이름{
	상수//일반 변수는 올 수 없다. 상수만 올 수 있다.
        abstract 메서드 
        // 이 안에는 기본적으로 abstract 메서드만 올 수 있다.(default도 올수 있는 경우 있음)
}
```



### 인터페이스 사용 방법: 상속

```java
interface 인터페이스이름 extends 부모인터페이스이름 {
} //객체 생성 되지 않는다.
```

```java
class 클래스명 extends 부모클래스명 implements 부모인터페이스이름{
}
```

- 클래스는 한개만 상속할 수 있지만, 인터페이스는 한개만 상속해도 된다는 조건이 없다. 여러개 상속해도 상관 없다.
- 일반적으로 클래스 상속은 실선으로, 인터페이스 상속은 점선으로 그린다.
- 프로그래밍에서 규격화는 중요하다.



- Factory: 객체를 대신 생성해주는 것



## 인터페이스 예시

```java
package day11;
import java.util.Random;
interface Drawable {
	 void draw();
	 /*draw에는 public이 없어서 아래 자녀부분에 public을 생략하면 에러메세지가 뜬다.
	  * void draw();-> public abstract void draw();와 동일하다.
	  * void draw(){} 인터페이스에는 이런 메소드가 올 수 없다.
	  * interface에서는 abstract와  public 을 생략해도 자동으로 입력 된다.*/
}
class Rect implements Drawable {
	public void draw() {
		//public void draw() 오버라이딩을 해야 한다.
		System.out.println("사각형을 그립니다.");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
class Diamond implements Drawable  {
	public void draw() {
		System.out.println("마름모를 그립니다.");
	}
}
public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Drawable d = null;
		if(num == 0)
			d = new Rect();
		else if(num == 1)
			d = new Circle();		
		else if(num == 2)
			d = new Diamond();		
		output(d);
	}
	public static void output(Drawable d){
		System.out.println("전달된 객체의 클래스명 : "+
	                        d.getClass().getName());
		d.draw();
	}
}




```





> JDK 1.0  JDK 1.1
>
> 8개 		23개



- vjava.nnn - 기본 api
  - java.lang, java.util, java.io, java.net, java.sql

- javax.nnn -확장 api
  - javax.sql, javax.nio

---

-> 자바 언어에서만 지원하는 API

- org.nnn-

---

-> 자바에서만 지원하지 않고 다른 프로그래밍 언어에서도 지원되는 API로 어떤 표준화 위원회나 조직에서 정한 API를 자바에서도 지원하기 위해 만든 API



- 인터페이스는

- " public static final 타입" , "public abstract 메서드이름(매개변수목록)"이 자동으로 붙는다.



-  인터페이스를 구현하는 것은 클래스를 상속받는 것과 같다.

- 다만, ‘extends’ 대신 ‘implements’를 사용한다.