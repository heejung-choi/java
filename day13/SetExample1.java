
package day13;
import java.util.*;
public class SetExample1 {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("자바"));//set 리턴값으로t/f을 받는다.
        System.out.println(set.add("카푸치노"));
        System.out.println(set.add("에스프레소"));
        System.out.println(set.add("자바"));
        System.out.println("저장된 데이터의 수 = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println(set);
    }
}
