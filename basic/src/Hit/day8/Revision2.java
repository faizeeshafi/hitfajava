package Hit.day8;

public class Revision2{
public void sayHello1() {
	System.out.println("no parameter method called...");
}
public void sayHello(int i) {
	System.out.println("one parameter method called...");
}
int sayHello1(int i,String s) {
	System.out.println("two parameter method called...");
	return 1;
}
void sayHello1(String s,int i) {
	System.out.println("two parameter string first method called...");
}
public void varialArgumentMethod(int i,int j,int k) {
	System.out.println("three int parameter method called...");
}
public void varialArgumentMethod(int...i) {
	System.out.println("var args method is called...");
	for(int s:i) {
		System.out.println(s+"");
	}
}
public void variable(String...s) {
	for(String str:s) {
		System.out.println(str);
	}
}
public void arrayMet(int i[]) {
	for(int j:i) {
		System.out.println(j+"\t");
	}
}
public int[]arraymet2() {
	int i[]= {34,54,67,78};
	return i;
}
public MyType complexTypeMethod(MyType...mytp) {
	return new MyType();
}
public static void main(String[] args) {
	Revision2 obj=new Revision2();
	obj.sayHello1("hello",34);
	obj.varialArgumentMethod(1,2,3,4,5,6,7);
	obj.variable("aaa","bbb","ccc","dddd");
	int i[]= {34,54,67,78};
	obj.arrayMet(i);int kk[]=obj.arraymet2();
	obj.complexTypeMethod(new MyType(),new MyType(),new MyType());
}
}
	class MyType{
	}	
	

