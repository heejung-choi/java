package day14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileOutExam1_1 {
	public static void main(String[] args) {
		String path = "C:/iotest/";
		String filename = "today.txt";
		File isDir = new File(path);
        if (!isDir.exists()) {
        	isDir.mkdirs();
        }
        
        try(FileWriter writer = new FileWriter(path + filename);){
        	Calendar c = Calendar.getInstance();
        	       	
        	writer.write(String.format("������ %tY�� %tm�� %td���Դϴ�.\n", c, c, c));
        	writer.write(String.format("������ %ta�����Դϴ�.\n", c));
        	
        	c = new GregorianCalendar(2019, 12, 20);
        	writer.write(String.format("���� %ta���Ͽ� �¾���ϴ�.\n", c));
        	
        	System.out.println("������ �Ϸ�Ǿ����ϴ�.");
        	
        }catch(IOException e) {
        	System.out.println(e.getMessage());
        	System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
        }
	        
	}
}
