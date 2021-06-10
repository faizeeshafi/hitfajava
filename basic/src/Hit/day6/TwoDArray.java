package Hit.day6;

public class TwoDArray {
	public static void main(String[] args) {
		int arr[]= {1,4,7,9};
		int marks[]=new int [5];
		marks[1]=1000;
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		for(int i:marks) {
			System.out.println("Value is...:"+i);
}
int twod[][]= {
		{22,44,33,55},
		{21,31,41,51}
};
int[][]twodd=new int[3][4];
twodd[1][1]=10000;
for(int i=0;i<twod.length;i++){
	for(int k=0;k<twod[i].length;k++) {
		System.out.print(twod[i][k]+"  ");
	}
	System.out.println();
}
	for(int i[]:twod) {
		for(int j:i) {
			System.out.print(j+"........");
		}
		System.out.println();
	}
	int unevenarr[][]= {
			{12,34,56},
			{56,23},
			{55,88,99,12}
	};
	int unevenarray2[][]=new int[3][];
	unevenarray2[0]=new int[3];
	unevenarray2[1]=new int[5];
	unevenarray2[2]=new int[2];
	for(int i[]:unevenarray2) {
		for(int k:i) {
			System.out.print(k+"++++");
		}
	System.out.println();
		}
	}
	}
