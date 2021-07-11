package Hit.day29.revision;

public class Inheritance {
public static void main(String[] args) {
	Parent p=new Child();
	System.out.println(p.x);
	p.met();
	p.goldMethod();
	
	p=new Child2();
	p.goldMethod();
	
}
}

abstract class Parent{
	public Parent(int i) {
		System.out.println("parent constructor called...");
	}
	public Parent(int i,String s) {
		System.out.println("overloaded constructor called...");
	}
	int x=10;
	public void goldMethod() {
		System.out.println("reusable method..");
	}
	final public void met() {
		System.out.println("parent met called...");
	}
	}
	class Child extends Parent{
		public Child() {
			super(2);
			System.out.println("child constructor called...");
		}
		int x=20;
		public void method() {
			System.out.println("child  method called...");
		}

	class Child2 extends Parent{
		public Child2() {
			super(33,"aaa");
		}
	}
	}

