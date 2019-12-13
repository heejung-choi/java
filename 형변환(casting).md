# 형변환(casting)

> 연산을 처리할 때  l-value의 타입과 r-value의 타입은 동일해야 한다.
> 그런데 만일 다른 타입이 사용되면 r-value의 값이 손실되지 않는 범위에서
> l-value의 타입으로 자동 변환한다.
> ivalue = cvalue;
> System.out.println(ivalue);// 문자데이터를 십진수 값으로 바꿔 내보냄 //65

- int = char // r-value가
  (4)    (2)
- int = double
  (4)    (8)

- byte < short < int < long < rloat< double
  (1)       (2)      (4)     (8)      (4)       (8)

> 왼쪽에서 오른쪽으로 형변환 하는 것은 가능하다. 
> 그러나 반대면 강제로 형변환 하는것 생각해봐야 한다.

- char < int < long < rloat< double
  (2)      (4)     (8)      (4)       (8) 

> 다음 중 다른 타입으로 절대로 변환이 안되는 것 (boolean})
> short = char
> char  = short
> char  = byte		
> 안됨 char와 byte는 음의 값도 있지만 char형은 음의 값이 없어서 
> 문자와 byte와 short 간의 형변환은 안된다. 하려면 강제 형변환 해줘야 한다. 강제 형변환은 가능



- l-value = r-value
  변수       식

> double   int
> long      char
> int        (int)double // double은 더 큰범위라서 강제로 변환시켜줘야 한댜.
> char      (char) int
>
> 실수       정수 // 자동형변환 된다.

### 자동형변환

(1) 정수에서 실수
(2) 사이즈가 적은 타입에서 큰 타입으로 변환

>  v1 + v2
> int   int   ---> int
> long long ---> long
> floot floot ---> floot
> int double ---> double
> int char    ---> int
> int long    ---> long
> long floot ---> floot
> char char  ---> int // 자바는 int 보다 작은 애들은 int로 바꿔서 연산한다.

