package Hit.day35;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int n=1/Integer.parseInt(args[0]);
		}
		catch(ArithmeticException ae) {
			System.out.println("See boss,what you did i did not like");
		}
		catch(ArrayIndexOutOfBoundsException aee) {
			System.out.println("boss boss,,,,please enter command line...");
		}
		finally {
			System.out.println("finaly called...");
		}
		System.out.println("After Exception");
	}

}

