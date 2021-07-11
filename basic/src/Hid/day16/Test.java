package Hid.day16;

public class Test {
	public static void main(String[] args)throws Exception {
		Box obj=new Box(20);
		Box obj1=new Box(30);
		Box obj2=new Box(50);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		
		
	}

}
class Box{
	int key;
	public Box(int key) {
		this.key=key;
		System.out.println("Box Class Object Created..."+key);
	}
	public String toString() {
		return"I am Box Class...MY key Value is"+key;
	}
}
