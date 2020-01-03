package day14;

import java.io.*;
import java.util.Date; 
public class FileTest2 { 
   public static void main(String[] args) throws Exception{       
      File dir = new File(args[0]); 
      if(!dir.exists() || !dir.isDirectory()) {
         System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
         return;
      } 
      long time = new Date().getTime();
      String newFileName = "temp"+time+".tmp";        
      File file = new File(dir,newFileName);      
      if (file.createNewFile())
         System.out.println(newFileName+"���� ������ �����Ǿ����ϴ�.");
      else
         System.out.println(newFileName+"���� ������ �̹� �����մϴ�.");
   }  
}


