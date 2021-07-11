package Hit.day10;

public class InheritDemo {
public static void main(String[] args) {
	Employee p=new Engineer();
	Engineer eng=new Engineer();
	
	p.met(2);
	eng.met(2);
}
}

class Human{
	public void blabla() {
		System.out.println("bla bla method called...");
	}
} 
class Employee extends Human{
	public int met(int i) {
		System.out.println("met method of employee called...");
		return i;
	}
}
class Engineer extends Employee{
	public int met(int i) {
		System.out.println("engineer met method called...");
		super.met(4);
		super.blabla();
		return i;
	}
}
class Attender extends Employee{
}
