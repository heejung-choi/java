package day15;

import java.io.*;
import java.util.*;

public class CopyExam {

	public static void main(String[] args) {
		FileReader reader=null;
		FileWriter writer=null;
		try {
			GregorianCalendar gc=new GregorianCalendar();
			reader=new FileReader("C:/iotest/sample.txt");//객체생성할때도 try블럭 안에
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
			System.out.println("저장 완료되었습니다.");
		}catch (FileNotFoundException fnfe) {
			System.out.println("처리하는 동안 오류가 발생했습니다.");
	    }catch (IOException ioe) {
	    	System.out.println("처리하는 동안 오류가 발생했습니다.");
	    }finally {
	    	try {
	    		if(writer!=null) {
	    			writer.close();
	    		}
	    	}catch(Exception e) {
	    		System.out.println("처리하는 동안 오류가 발생했습니다.");
	    	}
	    }
		
	}

}
