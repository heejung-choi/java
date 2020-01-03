package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		/*int lab1 [][] = new int [4][4];
		
		int a,b = 0;
		int num = 10;
		for(a=0 ; a<lab1.length ; a++) {
			for(b=0 ; b<lab1[a].length ; b++) {
				lab1[a][b] = num;
				num +=2;
			}
		}*/
		
		int nums[][]= {
				{10,12,14,16},
				{18,20,22,24},
				{26,28,30,32},
				{34,36,38,40},
			};
		System.out.println("1행 1열의 데이터:" + nums[0][0]);
		System.out.println("3행 4열의 데이터:" + nums[2][3]);
		
		System.out.println("행의 갯수:"+nums.length);
		System.out.println("열의 갯수:"+nums[0].length);
		
		System.out.print("3행의 데이터들:");
		for(int i=0; i<nums.length; i++) {
		System.out.print(nums[2][i]+" ");}
		System.out.println("");
		System.out.print("2열의 데이터들:");
		for(int j=0; j<nums.length; j++) {
			System.out.print(nums[j][1]+" ");}
		System.out.println("");
		
		System.out.print("왼쪽 대각선 데이터들:");
		 for(int row=0; row<nums.length; row++) {
			 for(int col=0; col<nums[row].length; col++) {
				 if(row==col) { 
				 System.out.print(nums[row][col]+" ");}
				 else
				System.out.print("");
			 }			 
			 }	
		 		 System.out.println(""); 
		
		 
		System.out.print("오른쪽 대각선 데이터들:");
			for(int row=0; row<nums.length; row++) {
				for(int col=0; col<nums[row].length; col++) {
				 if(row+col==nums.length-1) { 
					System.out.print(nums[row][col]+" ");}
				 else
					System.out.print("");
				 }			 
				 }	
			System.out.println("");
		 
		}
	}
