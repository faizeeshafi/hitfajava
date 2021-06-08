package basic;
import java.util.Scanner;
class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter Side of Square");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		//Area Of Square = side*side
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}

}
