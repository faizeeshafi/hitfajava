package Hit.day13;

public class AbstractDemo {
public static void main(String[] args) {
	new Child();
}
}
abstract class GrandParent{
	public abstract void met();
}
abstract class Parent extends GrandParent{
	final int i=10;
	public Parent() {
		System.out.println("abstract class Parent cons called...");
	}
	public abstract void yoursSayHello();
	public void mySayHello() {
		System.out.println("saying hello as per the abstract class norms...");
	}
}
class Child extends Parent{
	public void met() {}
	public Child() {
		System.out.println("child class abstarct parent object created...");
		
	}
	public void yoursSayHello(){
		System.out.println("say hello as per the child class logic...or norms.....");
	}
	public void mySayHello() {
		System.out.println("write my own logic..");
	}
}

