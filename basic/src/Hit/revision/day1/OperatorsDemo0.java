package Hit.revision.day1;

import java.util.Scanner;

public class OperatorsDemo0 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x value...:");
		int x=scan.nextInt();
		
		System.out.println("Enter y value...:");
		int y=scan.nextInt();
		
		int add=x+y;
		System.out.println("Addition ...:"+add);
		int sub=x-y;
		System.out.println("Subtraction...:"+sub);
		int mul=x*y;
		System.out.println("Multiplication...."+mul);
		int div=x/y;
		System.out.println("Division...:"+div);
		int reminder=x%y;
		System.out.println("Reminder...:"+reminder);
		
		int n=10;
		System.out.println(n);
		System.out.println(n++);
		System.out.println(n);
		System.out.println("++++++++++++++++++++++");
		
		n=10;
		System.out.println(n);
		System.out.println(++n);
		System.out.println(n);
		System.out.println("**********************");
		
		n=10;
		System.out.println(n);
		System.out.println(n--);
		System.out.println(n);
		System.out.println("++++++++++++++++++++++");
		
		n=10;
		System.out.println(n);
		System.out.println(--n);
		System.out.println(n);
		System.out.println("++++++++++++++++++++++");
		
		n=10;
		n+=10;
		System.out.println(n);
		System.out.println("......................");
		
		n=10;
		n-=10;
		System.out.println(n);
		System.out.println(".......................");
		
		n=10;
		n*=10;
		System.out.println(n);
		System.out.println(".......................");
		
		n=10;
		n%=10;
		System.out.println(n);
		System.out.println(".......................");
	}
}
