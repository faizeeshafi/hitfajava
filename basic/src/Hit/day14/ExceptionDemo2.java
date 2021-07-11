package Hit.day14;

public class ExceptionDemo2 {
public static void main(String[] args) {
	System.out.println("Before Exception...");
	int num=0;
	try {
		num=Integer.parseInt(args[0]);
		int i=1/num;
		System.out.println("immediate line after exception..");
	}
	catch(ArithmeticException ae) {
		System.out.println("logic to handle arithmetic exception");
	}
	catch(ArrayIndexOutOfBoundsException aoe) {
}
	catch(Exception e) {
		System.out.println("global exception handling code...common code");
	}
	finally {
		System.out.println("finally called...");
		num=1;
	}
int i=1/num;
System.out.println("value of i is...:"+num);
System.out.println("After Exception");
}
}

