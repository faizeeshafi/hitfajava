package Hit.revision.day2;

import java.util.Scanner;

public class LoopingDemo {
public static void main(String[] args) {
	boolean b=false;
	while(b) {
		System.out.println("while loop called...");
		
	}
	do {
		System.out.println("do while loop called...");
	}while(b);
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a value ...lesss than 10...");
	int x=scan.nextInt();
	System.out.println("+++++++++++++++");
	for(int i=0;i<10;++i) {
		System.out.println("for loop called...."+i);
	}
	for(int i=0,j=10;i<10 && j>0;i++,j--) {
		System.out.println(i+":"+j);
	}
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
		System.out.println(j+"]t");
	}
	System.out.println();
	}
}
}

