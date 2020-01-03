package exercise;

public class Student extends Human {
	String number;
	String major;
	public Student(){		
	}
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);	
		this.number = number;
		this.major = major;	
	}
	public String printInformation() {
		return super.printInformation()+"  " +number+"  "+major;
	}
}