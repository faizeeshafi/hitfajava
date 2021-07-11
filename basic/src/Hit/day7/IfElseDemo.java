package Hit.day7;

public class IfElseDemo {
public static void main(String[] args) {
	int i=18;
	if(i>20) {
		System.out.println("i is less than20");
	}
	else if(i==10) {
		System.out.println("i is equal to ten...");
}
    else
{
	System.out.println("i is greater than 20");
}
IfElseDemo obj=new IfElseDemo();
String result=obj.met(i);
System.out.println("The result is..."+result);

boolean b=false;
obj.met3(b);

String str="Hello";
obj.met4(str);
}
String met(int i) {
	if(i==10||i<20) {
		return "Condition satisfied...";
	}
	else {
		return "Condition is not satisfied...";
	}
	}
void met3(boolean valid) {
	if(valid) {
		System.out.println("The value of valid is true...");
	}
	else {
		System.out.println("The value of valid is false...");
	}
}
	

		void met4(String s){
		if(s.equalsIgnoreCase("Hello")){
			System.out.println("The value og String is hello");
		}
		else {
		System.out.println("not equal...");
	}
}
}
