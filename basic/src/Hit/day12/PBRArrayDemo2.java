package Hit.day12;

public class PBRArrayDemo2 {
public static void main(String[] args) {
	int arr[]=new int[5];
	for(int i:arr) {
		System.out.println(i+"\t");
	}
	System.out.println();
	AcceptArray obj=new AcceptArray();
	obj.modifyArray(arr);
	System.out.println("After Modification...");
	for(int i:arr){
		System.out.println(i+"\t");
	}
	System.out.println();
}
}
class AcceptArray
{
	public void modifyArray(int a[]) {
		a[2]=300;
	}
}

