package day14;

import java.io.File;
import java.util.Scanner;
public class FileTest1 {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
	  System.out.println("�����Ϸ��� ���丮���� �ۼ��ϼ��� : ");
	  String dirName = scan.nextLine();
	  File f = new File(dirName);
      if(f.exists()) {
    	  System.out.println(dirName + "���� ���丮�� �����մϴ�.");
      } else {
    	  if(f.mkdirs()) {	// mkdir's' �� ���� ���丮 ���� �� ������ش�!!! cf) mkdir �� ���� ���丮�� ����
    		  System.out.println(dirName + "���� ���丮�� �����Ǿ����ϴ�.");
    	  } else {
    		  System.out.println(dirName + "���� ���丮 ������ �����߽��ϴ�.");
    	  }
      }
      scan.close();	     
    }
}
