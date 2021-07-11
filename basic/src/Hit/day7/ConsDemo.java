package Hit.day7;

public class ConsDemo {
public ConsDemo() {
	System.out.println("constructor called");
}
public ConsDemo(int i) {
	System.out.println("overloaded cons called...");
}
public ConsDemo(String s) {
	System.out.println("String constructor called..");
}
public ConsDemo(int s,String str) {
	System.out.println("multi parameter constructor called...");
}
public static void main(String[] args) {
	ConsDemo obj1=new ConsDemo(100,"hello");
	ConsDemo obj2=new ConsDemo();
	obj2.met();
	obj2.met(1);
}
void met() {
	System.out.println("mthod without parameter called...");
}
void met(int i) {
	
	System.out.println("method with parameter called");
}
}
