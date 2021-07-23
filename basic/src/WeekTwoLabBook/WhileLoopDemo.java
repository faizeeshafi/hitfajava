package WeekTwoLabBook;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("P"
				+ "lease enter any integer value below 10:");
		number=sc.nextInt();
		
		while(number<=10) {
			sum=sum+number;
			number++;
			
		}
System.out.format("Sum of the Numbers from the while loop is:%d",sum);
	}

}
