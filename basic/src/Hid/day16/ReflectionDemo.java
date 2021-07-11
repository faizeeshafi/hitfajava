package Hid.day16;
import java.util.Scanner;
public class ReflectionDemo {
	public static void main(String[] args)throws Exception {
	Paint staticPaint=new RedPaint();
	System.out.println("Object created through static way...:"+staticPaint);
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the qualified class name...:");
	String paintClass=scan.next();
	Paint dynamicPaint=(Paint)Class.forName(paintClass).newInstance();
	System.out.println("Object created through dynamic way...:+dynamicPaint");
	Paint s=(Paint)Class.forName(paintClass).getConstructor().newInstance();
	System.out.println("Object created through new dynamic way...:"+dynamicPaint);
	}
}
abstract class Paint{
}
class RedPaint extends Paint{
	public RedPaint() {
}
}
class BluePaint extends Paint{
	public BluePaint() {
}
}