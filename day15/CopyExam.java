package day15;

import java.io.*;
import java.util.*;

public class CopyExam {

	public static void main(String[] args) {
		FileReader reader=null;
		FileWriter writer=null;
		try {
			GregorianCalendar gc=new GregorianCalendar();
			reader=new FileReader("C:/iotest/sample.txt");//��ü�����Ҷ��� try�� �ȿ�
			int data=0;
			char ch=0;
			String address=String.format("C:/iotest/sample_%d_%d_%d.txt",gc.get(Calendar.YEAR),gc.get(Calendar.MONTH)+1,gc.get(Calendar.DATE));
			System.out.println(address);
			writer=new FileWriter(address);
			while(true) {
				data=reader.read();
				if(data==-1) {
					break;
				}
				ch=(char) data;
				writer.write(ch);
			}
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		}catch (FileNotFoundException fnfe) {
			System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
	    }catch (IOException ioe) {
	    	System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
	    }finally {
	    	try {
	    		if(writer!=null) {
	    			writer.close();
	    		}
	    	}catch(Exception e) {
	    		System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
	    	}
	    }
		
	}

}
