package day13;
import java.util.*;
class LinkedListExample2 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("����");            
        list.add("����");           
        list.add("������");          
        list.add(2, "Ű��");          
        list.set(0, "������");         
        list.remove(1);             
        list.remove("Ű��");        
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
    }
}
