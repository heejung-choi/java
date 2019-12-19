# 20191219 컬렉션(Collections) API

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

- 리스트(배열리스트(array list), 연결리스트로 세분됨(linked list))

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





