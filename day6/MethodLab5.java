package day6;

public class MethodLab5 {
	public static void main(String[] args) {
					
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4); 		
	
	}

    public static int[] powerArray(int num) {
    	
    	int[] array = new int[10];
    	for(int i=0 ; i<10 ; i++) {
    	array[i]= (i+1)* num ;
    	System.out.print(array[i] + (i != 9 ? ",":"\n" ));
    	}
    	return array;
 
    }
}
