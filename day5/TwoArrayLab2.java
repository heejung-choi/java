package day5;
public class TwoArrayLab2 {
	public static void main(String[] args) {
		char[][] data = {
				{'B','C','A','A'},
				{'C','C','B','B'},
				{'D','A','A','D'}};
		int[] sum=new int[4];
		for(int row=0;row<data.length;row++) {
			for(int col=0;col<data[0].length;col++) {
				System.out.print(data[row][col]);
			}
			System.out.println();
		}
 
		for(int row=0;row<data.length;row++) {
			for(int col=0;col<data[0].length;col++) {
				switch(data[row][col]) {
				case 'A' : sum[0]++;
					break;
				case 'B' : sum[1]++;
					break;
				case 'C' : sum[2]++; 
					break;
				default : sum[3]++; 
					}
				}
			}
	
		for(int i=0;i<sum.length;i++) {
			System.out.println((char)(65+i)+"는"+sum[i]+"개 입니다.");
		}

	}
}
