# 2011219 컬렉션(Collections) API

- 데이터들을 저장하여 사용하는 방의 역할을 하는 API

- 저장할 수 있는 데이터의 타입에 제한이 없다.
- 저장할 수 있는 데이터의 갯수에 제한이 없다.



### List 

- 저장되는 데이터의 순서를 유지한다.
- 저장되는 데이터의 중복을 허용한다. 
- ArrayList, LinkedListm, Vector



### Set

- equals 내장 
- 저장되는 데이터의 순서를 유지하지 않는다.
- 저장되는 데이터의 중복을 허용하지 않는다.
- HashSet, LinkedHashset



- list와 set은 조상이 같다.
- add, set을 사용한다.



### Map

- 데이터 이름과 데이터 값을 쌍으로 저장한다.
- 데이터 이름은 중복 저장이 불가능하다.
- (키)
- key-value 쌍으로 데이터 저장
- HashMap, Hashtable 
  - Hashtable 보다는 HashMap을 쓰라고 권장하고 있다.



### 자료구조

데이터를 효율적으로 사용할 수 있도록 구조를 만들어서 저장해둔 것



### 자료구조의 종류

- 리스트
  - 배열리스트(array list)
  - 연결리스트 (linked list) - 주로 편집 작업에 유리하다.

- 스택(Stack): LIFO(Last In First Out) 를 따른다. 즉, 가장 최근에 스택에 추가한 항목이 가장 먼저 제거될 항목이다.
  - (마지막에 넣은 것을 꺼내고 싶을 때)

- 큐(queue): 먼저 집어 넣은 데이터가 먼저 나오는  FIFO(First In First Out)구조로 저장하는 방식
  - (먼저 넣은것을 꺼내고 싶을 때)

- 해쉬테이블(hashtable) : 검색을 빨리하기 위해 사용, 데이터의 고유값을 가지고 분류해서 저장하는 것

- 집합(set): 중복데이터를 허용하지 않는 자료구조



- array list: 순서대로 클래스 내부에 있는 배열에 데이터 저장
- linked list:인접데이터가 서로 가리키는 식으로 데이터 저장



### collections 클래스

- collection API들을 도와주는 도우미 클래스





```
ArrayList<E>
//객체생성시 이객체가 처리할 타입정보를 같이 전달해야 한다는 뜻, 명시해주지 않으면 자동으로 Object class가 된다.
```



### 예제 1

```java
package day13;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();//LinkedList()는 타입을 지정해줘야 한다. 지정해주지 않으면 자동으로 Object로 지정된다.
		list.add("java");
		list.add("100"); 
		//list.add(100);이렇게 하면 예외가 발생한다. java.lang.ClassCastException 
		//->객체 형이 다른 형태 캐스팅 할때 맞지 않으면 나는 오류로 integer는 String 형이 될 수 없다는 에러
		//컴파일에러는 고칠 수 있지만 실행 에러는 문제가 커진다.
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)//size() LinkedList에 들어있는 크기
			System.out.println(list.get(i));
		System.out.println();		
		
		for(Object value : list) {
			String s = (String)value;		
			System.out.println(s);
		}
		System.out.println();		
		
		Iterator iter = list.iterator();
		//Iterator:인터페이스, 콜렉션 객체가 뭐가 됬든 그 안에 있는 데이터들을 하나하나 꺼내는 기능을 규약시켜 놓은것
		//set 객체든 list 객체든 모두 꺼낼 수 있다.
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
	}
}

```

### Generic

실행오류가 덜나는 프로그램을 만들 수 있다.



### 예제2

```java
package day13;
import java.util.*;
public class GenericTestNew {
	public static void main(String[] args) {
		// 제네릭스 라는 구문이 적용되어 만들어진 클래스의 객체 생성시
		// 타입 파라미터라는 것을 사용한다. 
		LinkedList<String> list = new LinkedList<String>();  // 타입파라미터
		//타입 파라미터를 넣으면 집어 넣을 때도 String인지 확인하고, 저장할 때도 확인한다.
		//그렇기 때문에 형변환이 필요 없다.
		list.add("java");
		list.add("100");
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		
		for(String value : list) {			
			System.out.println(value);
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String s = iter.next();			
			System.out.println(s);
		}
	}
}


```

### 예제3



```java
package day13;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();//Value1 String 객체만 처리 가능
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();//어떤 객체든 저장은 할 수 있다.
		o2.put("abc");
		String s2 = (String)o2.get(); //꺼낼때 형변환 해줘야 한다.
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();
		//	Value3<String> o3 = new Value3<>-> 여기에 빈꺽세괄호만 줘도 된다 java8부터 
		// 원래는 	Value3<String> o3 = new Value3<String>(); java8이전에는 이렇게 줘야 한다.
		o3.put("abc");
		String s3 = o3.get(); //형변환을 하지 않아도 된다.
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();
		//o4.put("abc"); 타입파라미터로 Date를 줬기 때문에 반드시 Date가 와야한
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}


class Value1 {//String 객체만 저장할 수 있다.
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
class Value2 {
	//String, StringBuffer, 기본형 등이 들어갈 수 있다. 대신에 put으로 객체를 넣을때는 상관 없지만 꺼낼때는 형변환을 해야한다.\
	//기존에 Generic 구문이 없어서 이렇게밖에 처리를 못했다.
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// Value3<Card> v = new Value3<Card>();//객체생성시 타입파라미터를 <Card>로 주면 T가 Card로 바뀐다. 매개변수, return값
// Value3<String> v = new Value3<String>();객체생성시 타입파라미터를 <String>로 주면 T가 Card로 바뀐다. 매개변수, return값
//클래스가 처리할 데이터 타입을 객체생성시점에서 정하겠다라는 구문이다.
//Generic 구문 전에는 데이터 타입을 처음부터 정해야 했지만 Generic을 사용하면 데이터 타입을 객체 생성시마다 동적으로 변화줄 수 있다.

class Value3<T> {//<T> 꺽세괄호 안에 아무거나 넣어도 된다. element의 타입을 의미함
	//객체생성시 TT라는 타입 파라미터를 받을 것이라는 의미이다.
	T obj;
	void put(T obj){
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
```



## Class LinkedList<E>

- [java.lang.Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
- - [java.util.AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)<E>
  - - [java.util.AbstractList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html)<E>
    - - [java.util.AbstractSequentialList](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractSequentialList.html)<E>
      - - java.util.LinkedList<E>

- - **Type Parameters:**

    `E` - the type of elements held in this collection

--> <E>로 타입 유형이 바뀐다.



![image-20191219110644107](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219110644107.png)

LinkedList 양방향이다. 

![image-20191219110720563](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219110720563.png)

- ArrayList<String>list = new ArrayList<String>();

- 가로 안에 안넣어 주면 기본으로 10개가 저장된다.



# ArrayList 사용

ArrayList<String>list = new ArrayList<String>();

list.add("포도");

list.add("딸기");

list.add("복숭아");

String str=list.get(2); // 인덱스 2 위치에 있는 복숭아를 리턴한다.

```java
package day13;
import java.util.*;
class ArrayListExample1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("포도");          
        list.add("딸기");          
        list.add("복숭아");          
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(new Integer(100));        
        list2.add(1000);// JDK 1.5 부터 AUTO Boxing 이라는 구문이 지원
        //list2.add("1000");
    }
}



```

list.add(2,"키위");

![image-20191219111141641](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219111141641.png)

-> 자리 이동을 하게 되기 때문에 ArrayList보다는 LinkedList가 좋다.

list.set(0,"오렌지");

![image-20191219111245873](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219111245873.png)

데이터를 바꾸고 싶을 때 사용

![image-20191219111308343](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219111308343.png)

![image-20191219111312391](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219111312391.png)

```java
package day13;
import java.util.*;
public class ArrayListExample2 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("포도");            
        list.add("딸기");           
        list.add("복숭아");  
        System.out.println(list);
        list.add(2, "키위"); 
        System.out.println(list);
        list.set(0, "오렌지"); 
        System.out.println(list);
        list.remove(1);   
        System.out.println(list);
        list.remove("키위");
        System.out.println(list);
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
        for(String fruit : list)
        	System.out.println(fruit);
        Iterator<String> iter = list.iterator();
        while(iter.hasNext())
        	System.out.println(iter.next());
        
    }
}

```

int index = list.indexOf("사과");

사과의 위치를 리턴 

int index = list.lastindexOf("사과");

마지막 사과의 위치를 리턴

```java
package day13;
import java.util.*;
class ArrayListExample3 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("머루");            
        list.add("사과");           
        list.add("앵두");       
        list.add("자두");       
        list.add("사과");         
        int index1 = list.indexOf("사과"); 
        int index2 = list.lastIndexOf("사과"); 
        System.out.println("첫번째 사과: " + index1);
        System.out.println("마지막 사과: " + index2);
    }
}

```

arraylist와 linkedlist는 부모가 list로 동일하다.



# LinkedList

LinkedList<String> list= new LinkedList<String>();

list.add("포도");            
list.add("딸기");           
list.add("복숭아"); 



String str =list.get(2)

첫번째 데이터부터 인덱스 0으로 삼아 찾기 시작한다.

데이터를 찾는것은 arraylist보다 어렵다.

이것을 개선하기 위한 방법은 

for each문을 쓰거나 



* 편집시에는 LinkedList가 좋다.

list add(2,"키위");

list.remove(1);

![image-20191219112506156](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219112506156.png)

![image-20191219112515752](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191219112515752.png)



### LinkedList 순차적으로 접근하는 방법

1) iterator 메소드를 호출한다.

Iterator<String>iterator=list.iterator();

2)  iterator 객체에 대해 next 메소드를 호출한다.

String str = iterator.next();



### 향상된for 문으로리스트를사용하는방법

for(String str :list){

//변수타입 변수이름: 리스트객체

}



### 스택

- 데이터를 넣은 순서의 역순으로만 꺼낼 수 있는 자료구조

- 스택 안에 집어 넣는 것을 push라고 하고 꺼내는 것을 pop이라고 한다.

- 스택으로사용할수있는클래스:  LinkedList 클래스

- arraylist는 addlast없다.

- addlast는 데이터를 넣는 것이다.
- Integer obj =getLast(); 데이터를 제거하지 않고 꺼내는 방법
- 꺼내오면서 제거하고 싶으면 removelast

```java
importjava.util.*;
classStackExample1{
publicstaticvoidmain(Stringargs[]){
LinkedList<Integer>stack=newLinkedList<Integer>();
stack.addLast(newInteger(12));
stack.addLast(newInteger(59));
stack.addLast(newInteger(7));
while(!stack.isEmpty()){
Integernum=stack.removeLast();
System.out.println(num);
}
}
}
```

### 큐(queue)

- 데이터를 넣은 순서와 같은 순서로만 꺼낼 수 있는 자료구조

- 큐로사용할수있는클래스: LinkedList 클래스

- 큐 생성방법
  - LinkedList<String>queue=new LinkedList<String>();

- poll 제일 앞에 있던 것 리턴, 꺼내면서 지우는것
- peek 제일 앞에 있던 것 리턴, 꺼내면서 남겨둔다.

```java
importjava.util.*;
classQueueExample1{
publicstaticvoidmain(Stringargs[]){
LinkedList<String>queue=newLinkedList<String>();
queue.offer("토끼");
queue.offer("사슴");
queue.offer("호랑이");
while(!queue.isEmpty()){
Stringstr=queue.poll();
System.out.println(str);
}
```



## import 간단하게 하는법

import java.util.LinkedList;

import java.util.Iterator;



--> 

한번에 하려면

import java.util.*;



## Hash set 클래스

- set.add("자바");
  - 이미 있는 데이터를 저장하면 집합에 변동이 일어나지 않는다.
- int num= set.size(); 
  - 집합에 있는 데이터의 수를 리턴한다.
- 데이터를 꺼내는게 없어서 for each문을 쓰거나, iterator를 써야 한다.



## Hash table

- hash table을 넣는 것을 bucket 이라고 한다.

- 여러개의통(bucket)을만들어두고키값을이용하여데이터를넣을통번호를계산하는자료구조

- 데이터를 나눠서 넣고 싶다라고 하면 hash set이나 hash table을 사용한다.
- HashMap<String, Integer> hashtable = new HashMap(String, Interger)();

- 키값이 동일하면 기존 데이터를 마음대로 바꿔서 저장한다.

- hashtable.put("해리",new Integer(95));
- ----------------------->키값, 데이터

- lnteger num = hashtable.get("해리");

  - 키 값으로 통번호를 계산하여 그 통안에서 키값과 일치하는 데이터를 찾아서 리턴한다.
  - 

  