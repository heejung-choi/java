package work;

public class PlaneTest {
    public static void main(String args[]) {
    	// 2���� ���Ҹ� ���� plane Ÿ���� �迭��ü�� ����
    	Plane[]p= new Plane[2]; 
    	      
    	//Airplane�� Cargoplane ��ü �����Ͽ� �� ���ҷ� ����
    	p[0]= new Airplane("L747",1000);
    	p[1]= new Cargoplane("C40",1000);
        // ������ ��ü�� ���� ���
    	printInfo(p);
        // Airplane�� Cargoplane ��ü�� 100�� ���� �� ��ü ���� ���
    	p[0].flight(100);
    	p[1].flight(100);
    	printInfo(p);
        // Airplane�� Cargoplane ��ü�� 200 ���� �� ��ü ���� ���
    	p[0].refuel(200);
    	p[1].refuel(200);
    	printInfo(p);
    }
public static void printInfo(Plane[] list) {
        // Ÿ��Ʋ ���
   	System.out.println("Plane      "+"fuelSize      ");   	
	System.out.println(" ---------------------------");

	for (int i=0; i<list.length; i++) {
	System.out.print(list[i].getPlaneName()+"      "+list[i].getFuelSize());
	System.out.println();}
        // Plane ��ü���� ������ ���(��� ��� ����)
		// �迭��ü
    }
}
