package Hit.day8;

public class HelloWorldd {
public HelloWorldd() {

}
public static void main(String gayas[]) {
	System.out.println(gayas[0]+"..........."+gayas[1]);
	Hello hello=new Hello();
	Hello.myMethod();
}

public static void main(int [] args) {
	
}
}
class Hello{
static int i=10;
static float f=10.1f;
static double d=212121.3434;
long l=3982409;
short s=2323;
byte b=-128;

public static void myMethod() {
	System.out.println(i +":"+f+":"+d);
}
}