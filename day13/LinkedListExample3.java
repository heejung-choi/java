package day13;
import java.util.*;
class LinkedListExample3 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("����");            
        list.add("���ξ���");           
        list.add("�ٳ���");   
        Iterator<String> iterator = list.iterator();   
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        
    }
}
