package day2;
public class SwitchLab2 {
	public static void main(String[] args) {
		int value = (int)(Math.random()*5)+1;
		int su1=300;
		int su2=50;
		int result=0;
		
	switch(value) {
	case 1: result=su1+su2;
	break;
	case 2: result=su1-su2;
	break;
	case 3: result=su1*su2;
	break;
	case 4: result=su1/su2;
	break;
	default:result=su1%su2;
	}
	 System.out.println("°á°ú°ª:"+result);
	}

}

