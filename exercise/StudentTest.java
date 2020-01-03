package exercise;

public class StudentTest {

	public static void main(String[] args) {
		Student array []= new Student[3];
		array[0]= new Student ("홍길동",20,171,81,"201101","영문");
		array[1]= new Student ("고길동",21,183,72,"201102","건축");
		array[2]= new Student ("박길동",22,175,65,"201103","컴공");
		for(int i = 0; i<array.length ; i++)
			System.out.println(array[i].printInformation());
	}

}

