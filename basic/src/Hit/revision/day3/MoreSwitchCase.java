package Hit.revision.day3;

import java.util.Scanner;

public class MoreSwitchCase {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please Enter s String...");
	String s=scan.next();
	System.out.println("Please Enter a int...");
	int i=scan.nextInt();
	System.out.println("Please enter a char...");
	char c=scan.next().charAt(0);
	enum myenum {apple,mango,grapes};

	switch(s) {
	case "hai":{
		System.out.println("hai value...."+s);
		break;
	}
	case "hello":{
		System.out.println("hello value...."+s);
		break;
	}
	default:{
	System.out.println("default pf string switch called....."+s);
	}
	
	}
	System.out.println("\n........");
	switch(i) {
	default:{
		System.out.println("default called..."+i);
		break;
	}
	case 1:{
		System.out.println("value of int is 1...."+i);
		break;
		
	}
	case 2:{
		System.out.println("value of int is2...."+i);
		break;
		
	}
	case 3:{
		System.out.println("value of int is 2...."+i);
		break;
	}
	System.out.println("\n character switch called....");
	switch(c) {
	case 'b':{
		System.out.println("b called...:"+c);
		break;
	}
	case 'a':{
		System.out.println("a called....:"+c);
		break;
	}
	default:{
		System.out.println("default of char called...");
	}
	}
	System.out.println("\n enum switch is called.......");
	switch(myenum.apple) {
	case apple:{
		System.out.println("aplle enum called...");
		break;
	}
	case grapes:{
		System.out.println("grapes enum called...");
		break;
	}
	default:{
		System.out.println("default enum called...");
	}
	}
	
	}
	}

}
