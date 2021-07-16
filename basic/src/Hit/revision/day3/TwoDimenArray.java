package Hit.revision.day3;

public class TwoDimenArray {
	public static void main(String[] args) {
		int arr[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int row[]:arr) {
			for(int j:row) {
				System.out.println(j+"\t");
			}
			System.out.println();
		}
		System.out.println("\n UnEven multi dimensional array........");
		int uneven[][]= {
				{10,20,30,40,50,60,},
				{100,200,300},
				{1000,2000,3000},
				{1,2}
				
		};
		int uneven2[][]=new int[4][];
		uneven2[0]=new int[5];
		uneven2[1]=new int[3];
		uneven2[2]=new int[2];
		uneven2[3]=new int[4];
		
		for(int row[]:uneven) {
			for(int value:row) {
				System.out.println(value+"\t");
			}
			System.out.println();
		}
		
	}

}
