package mobile;

public class MobileTest {   
    public static void main(String args[]) {
    	  // ������ Mobile ��ü�� �����Ѵ�.
         // ������ ��ü�� ������ ����Ѵ�.(printMobile() ȣ��)
         // ������ Mobile ��ü�� 10�о� ������ �Ѵ�. 
         // 10�� ���� �� ��ü ������ ����Ѵ�.(printMobile() ȣ��)
         // ������ Mobile ��ü�� 5�о� ��ȭ�� �Ѵ�.
         // 5�� ��ȭ �� ��ü ������ ����Ѵ�.(printMobile() ȣ��)
    		Ltab l = new Ltab("Ltab",500,"ABC-01");
    		Otab o = new Otab("Otab",1000,"XYZ-20");
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
    		l.charge(10);
    		o.charge(10);
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
    		l.operate(5);
    		o.operate(5);
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
			}    
    public static void printMobile(Mobile mobile) {
    	System.out.print(mobile.getMobileName()+"          ");
    	System.out.print(mobile.getBatterySize()+"          ");
    	System.out.print(mobile.getOsType()+"          ");
    	System.out.println();
//����Ʈ����� lž ož ��� ���� ����
    }
    public static void printTitle() {
    	System.out.println("Mobile          "+"Battery          "+"OS          ");
    	System.out.println(" --------------------------------------------------------");
    }
}


