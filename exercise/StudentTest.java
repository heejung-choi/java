package exercise;

public class StudentTest {

	public static void main(String[] args) {
		Student array []= new Student[3];
		array[0]= new Student ("ȫ�浿",20,171,81,"201101","����");
		array[1]= new Student ("��浿",21,183,72,"201102","����");
		array[2]= new Student ("�ڱ浿",22,175,65,"201103","�İ�");
		for(int i = 0; i<array.length ; i++)
			System.out.println(array[i].printInformation());
	}

}

