package Hit.revision.day3;

import java.util.Scanner;

public class IfElseIfDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value...:");
		
		int i=scan.nextInt();
		
		if(i==10) {
			System.out.println("i value entered is 10");
		}
		else if(i==20) {
			System.out.println("i value entered is 20");
		}
		else if(i==30) {
			System.out.println("i value entered is 30");
		}
		else {
			System.out.println("does not satisfy any condition...");
		}
		System.out.println("Please enter another number....");int j=scan.nextInt();
		
		if(i>=10&&j<=20) {
			System.out.println("The value is between 1 and 20");
		}
			else if(i>=20&&j<=40) {
				System.out.println("The value is between 20 and 40");
			}
			else if(i>40&&j<=100) {
				System.out.println("None of the condition satisfied..");
				
			}
		}
	
	
}


