
package day13;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("�ڹ�"));//set ���ϰ�����t/f�� �޴´�.
        System.out.println(set.add("īǪġ��"));
        System.out.println(set.add("����������"));
        System.out.println(set.add("�ڹ�"));
        System.out.println("����� �������� �� = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println(set);
    }
}
