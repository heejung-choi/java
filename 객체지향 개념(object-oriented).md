# 객체지향 개념(object-oriented)

### 객체지향 언어의 역사

- 과학, 군사적 모의실험(simulation)을 위해 컴퓨터를 이용한 가상세계를 구현하려는 노력으로부터 객체지향이론이 시작됨
- 1960년대 최초의 객체지향언어 Simula탄생
- 1980년대 절차방식의 프로그래밍의 한계를 객체지향방식으로 극복하려고 노력함.(C++, Smalltalk과 같은 보다 발전된 객체지향언어가 탄생)
- 1995년 말 Java탄생. 객체지향언어가 프로그래밍 언어의 주류가 됨



### 객체지향 언어의 특징

- 기존의 프로그래밍언어와 크게 다르지 않다.
  - 기존의 프로그래밍 언어에 몇가지 규칙을 추가한 것일 뿐이다.
- 코드의 재사용성이 높다.
  - 새로운 코드를 작성할 때 기존의 코드를 이용해서 쉽게 작성할 수 있다.
- 코드의 관리가 쉬워졌다.
  - 코드간의 관계를 맺어줌으로써 보다 적은 노력으로 코드변경이 가능하다.
- 신뢰성이 높은 프로그램의 개발을 가능하게 한다.
  - 제어자와 메서드를 이용해서 데이터를 보호하고, 코드의 중복을 제거하여 코드의 불일치로 인한 오류를 방지할 수 있다. 

### 클래스와 객체

- 클래스의 정의

  - 클래스란 객체를 정의해 놓은 것이다.

- 클래스의 용도

  - 클래스는 객체를 생성하는데 사용된다.

- 객체의 정의

  - 실제로 존재하는 것 사물, 또는 개념

- 객체의 용도

  - 객체의 속성과 기능에 따라 다름
  - 객체나 인스턴트나 비슷한 개념

  | 클래스       | 객체   |
  | ------------ | ------ |
  | 제품  설계도 | 제품   |
  | TV설계도     | TV     |
  | 붕어빵기계   | 붕어빵 |

  

- 객체 ≒ 인스턴스

   객체(object)는 인스턴스(instance)를 포함하는 일반적인 의미

- 클래스로부터 생성된 객체일지라도 서로 독립적이라서느 한 객체의 변화가 다른 객체에 영향을 주지 않는다.



### 객체의 구성요소

- 객체는 속성과 기능으로 이루어져 있다.
  - 객체는 속성과 기능의 집합이며, 속성과 기능을 객체의 멤버(member, 구성요소)라고 한다
- 속성은 변수로 기능은 메서드로 정의한다.
  - 클래스를 정의할 때 객체의 속성은 변수로, 기능은 메서드로 정의한다.
  - 

### 인스턴트 생성과 사용

##### 인스턴스의 생성방법

- 클래스명 참조변수명;
  - 객체를 다루기 위한 참조 변수 선언
- 참조변수명 = new 클레스명();
  - 객체 생성 후 생성된 객체의 주소를 참조변수에 저장

```
Tv t; //TV 객체를 넣는다. t는 4바이트, 자바의 모든 유형의 참조값은 4바이트이다.
t = new Tv();//tv 클래스에 있는 멤버 변수들이 나온다.
Tv t = new Tv();
t.channel=7; //멤버들은 자동 초기화 되어있다.(기본값 int=0), 기본값 위에 7을 넣어준다.
t.channelDown(); 
System.out.println(t.channel);
```

``` 
Tv t1 = new Tv(); 
Tv t2 = new Tv(); 
t2 = t1; //t2가 t1을 참조하고 있다. 기존에 있던 t2값은 garbage 라고 한다. 
//garbage는 메모리 할당은 되어있으나 쓰지 않는 경우로 메모리 낭비 되고 있는 경우이다.
//java는 jvm이 대신 청소해준다.(* 자동 감지 콜렉션)
```







