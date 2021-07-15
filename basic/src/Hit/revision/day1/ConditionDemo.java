package Hit.revision.day1;
import java.util.Scanner;
public class ConditionDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter x value..");
	int x=scan.nextInt();
	
	boolean result=(x%2==0);
	if(result) {
System.out.println("Even number...:"+x);
}
	else {
		System.out.println("Odd number...:"+x);
	}
	int reminder=x%2;
	switch(reminder) {
	case 0:{
		System.out.println("Evennnnnnnn..."+x);
		break;
	}
		case 1:{
			System.out.println("Odddddddddddd..."+x);
			break;
		}
	}
	
			String str=(x%2==0)?"eveeeeeeeeeeeeeeeeeeeeeeeeennnn":"odiiiiiiiiiiiiiiiiiiiii";
			System.out.println(str);
		}
	
}
		
	
	
	
