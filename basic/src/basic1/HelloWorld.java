package basic1;
import java.util.Scanner;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Welcome to JAVA");
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your name");
	String name=scan.next();
	System.out.println("Welcome to Java practise..." + name);
}
}
