package day6;

public class MethodLab4 {
	public static void main(String[] args) {
			
		int ary1[] = {10, 20, 30};
		int ary2[] = {100, 500, 300, 200, 400};
		int ary3[] = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		
		System.out.println("���� ū ����" +maxNumArray(ary1)+"�Դϴ�.");
		System.out.println("���� ū ����" +maxNumArray(ary2)+"�Դϴ�.");
		System.out.println("���� ū ����" +maxNumArray(ary3)+"�Դϴ�.");
	
	
	}

    public static int maxNumArray(int[] num) {
    	int max;
    	max = num[0];
    	for(int i=0 ; i <num.length ; i++) {
    		if(num[i] > max)
    			max = num[i];
    	}
    	return max;
 
    }
}
