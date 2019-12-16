# 추상클래스 - abstract Lab 20191216

## 문제 1번

**Abstract** **클래스에서 상속 받은 두 개의 클래스를 구현 하는 프로그램을 작성 한다**

### 1. **사용 데이터**

| **mobileName** | **batterySize** | **osType** |
| -------------- | --------------- | ---------- |
| **Ltab**       | **500**         | **ABC-01** |
| **Otab**       | **1000**        | **XYZ-20** |

## 2. **클래스 다이어그램**



![image-20191216160338960](C:\Users\student\AppData\Roaming\Typora\typora-user-images\image-20191216160338960.png)

## **3.** **구현 클래스** 

| **Package****명**                                            | **클래스명**                                                 | **메소드**               | **설명**                 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------ | ------------------------ |
| **mobile**                                                   | **Mobile**                                                   | **+Mobile()**            | **매개변수 없는 생성자** |
| **+Mobile(mobileName:String, batterySize:int,osType:String)** | **3****개의 멤버 변수의 값을 입력 받는 생성자**              |                          |                          |
| ***+operate(time:int):void\***                               | **abstract** **메서드로 정의**                               |                          |                          |
| ***+charge(time:int):void\***                                | **abstract** **메서드로 정의**                               |                          |                          |
| **Ltab**                                                     | **+Ltab()**                                                  | **매개변수 없는 생성자** |                          |
| **+Ltab(mobileName:String, batterySize:int,osType:String)**  | **3**개의 멤버 변수의 값을 입력 받는 생성자**                |                          |                          |
| **+operate(time:int):void**                                  | **사용을 통해 배터리 감소 구현,**   **1**분 사용 시 배터리 10감소 |                          |                          |
| **+charge(time:int):void**                                   | **충전을 통한 배터리 증가 구현**  **1**분 충전 시 배터리 10증가 |                          |                          |
| **Otab**                                                     | **+Otab()**                                                  | **매개변수 없는 생성자** |                          |
| **+Otab(mobileName:String, batterySize:int,osType:String)**  | **3**개의 멤버 변수의 값을 입력 받는 생성자                  |                          |                          |
| **+operate(time:int):void**                                  | **사용을 통해 배터리 감소 구현**  **1**분 사용 시 배터리 12감소 |                          |                          |
| **+charge(time:int):void**                                   | **충전을 통한 배터리 증가 구현**  **1**분 충전 시 배터리 8증가 |                          |                          |

 ***** **필요 시 getXXX와 setXXX는 자율적으로 구현 한다**

## **4. MobileTest** **클래스 구조**

```java
public class MobileTest {   
    public static void main(String args[]) {
    	  // 각각의 Mobile 객체를 생성한다.
         // 생성된 객체의 정보를 출력한다.(printMobile() 호출)
         // 각각의 Mobile 객체에 10분씩 충전을 한다. 
         // 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
         // 각각의 Mobile 객체에 5분씩 통화를 한다.
         // 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
    }
    public static void printMobile(Mobile mobile) {
//프린트모바일 l탑 o탑 모두 정의 가능
    }
    public static void printTitle() {
// Mobile         	Battery           	OS
// --------------------------------------------------------

    }
}
```

## 5. **실행 결과 예**

```java
     Mobile         	Battery           	OS
  --------------------------------------------------------
    Ltab              	500            		ABC-01
    Otab              1000           		XYZ-20

[ 10분 충전 ]
     Mobile          	Battery           	OS
  --------------------------------------------------------
    Ltab              	600             	ABC-01
    Otab              1080            	XYZ-20

[ 5분 통화 ]
     Mobile          	Battery        	        OS
  --------------------------------------------------------
    Ltab             	550             	ABC-01
    Otab              1020            	XYZ-20

```



## 답변

### MobileTest

```java
package mobile;

public class MobileTest {   
    public static void main(String args[]) {
    	  // 각각의 Mobile 객체를 생성한다.
         // 생성된 객체의 정보를 출력한다.(printMobile() 호출)
         // 각각의 Mobile 객체에 10분씩 충전을 한다. 
         // 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
         // 각각의 Mobile 객체에 5분씩 통화를 한다.
         // 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
    		Ltab l = new Ltab("Ltab",500,"ABC-01");
    		Otab o = new Otab("Otab",1000,"XYZ-20");
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
    		l.charge(10);
    		o.charge(10);
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
    		l.operate(5);
    		o.operate(5);
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
			}    
    public static void printMobile(Mobile mobile) {
    	System.out.print(mobile.getMobileName()+"          ");
    	System.out.print(mobile.getBatterySize()+"          ");
    	System.out.print(mobile.getOsType()+"          ");
    	System.out.println();
//프린트모바일 l탑 o탑 모두 정의 가능
    }
    public static void printTitle() {
    	System.out.println("Mobile          "+"Battery          "+"OS          ");
    	System.out.println(" --------------------------------------------------------");
    }
 }
```

### Mobile

```java
package mobile;

abstract class Mobile {
	String mobileName;
	int batterySize;
	String osType;
	
	public Mobile(){}
	
	public Mobile(String moblieName, int batterySize, String osType ){		
	this.mobileName = moblieName;
	this.batterySize = batterySize ;
	this.osType = osType ;	
}
	abstract void operate(int time);
	abstract void charge(int time);

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
}
```

### Ltab

```java
package mobile;

 class Ltab extends Mobile {
	public Ltab(){}
	public Ltab(String moblieName, int batterySize, String osType ){		
	super(moblieName, batterySize, osType);	
	
}
	void operate(int time) {	
	batterySize-=10*time;	
		
	}
	
	void charge(int time) {
	batterySize+=10*time;	
		
		
	}
}
```

### Otab

```java
package mobile;

class Otab extends Mobile {
	public Otab(){}
	public Otab(String moblieName, int batterySize, String osType ){		
	super(moblieName, batterySize, osType);
}
	void operate(int time) {
	batterySize-=12*time;	
		
	}
	void charge(int time) {
	batterySize+=8*time;			
	}
}

```

