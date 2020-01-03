package day8;

class parent{//java.lang.object
	int x=1, y=2;
		
	public String toString() {
		return "parent 클래스의 객체 입니당";
	}
}
class child extends parent{
	int x=10;
	void printInfo(){
		int x=100;
		System.out.println(x);		//100
		System.out.println(this.x);	//10 나의 멤버x
		System.out.println(super.x);//1 조상x
		System.out.println(y);		//2
		System.out.println(this.y);	//2
		System.out.println(super.y);//2
		//System.out.println(z);
	}
	public String toString() {
		return "child 클래스의 객체 입니당";
	}
	
}
public class ParentChildTest {
	public static void main(String[] args) {
		parent p = new parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("출력1"+p);
		Card c = new Card();
		System.out.println(c.toString());
		System.out.println("출력1"+c);
		java.util.Date d=new java.util.Date();
		System.out.println(d.toString());
		System.out.println("출력3"+d);
		child ch = new child();
		System.out.println("출력4"+ch);
		ch.printInfo();
		System.out.println(ch.x);
		System.out.println(ch.y);
	}

}
