package Hit.day18;

public class InterfaceDemo3 {
public static void main(String[] args) {
	Student student=()-> {
	System.out.println("learning method logic...");
	};
	student.learn();
	
	Driver driver=(String s)-> {
		System.out.println("The driver logis ic...:");
		System.out.println("The value supplied is....:");
	};
	driver.drive("the light machine...:");
	Pilot pilot=(name,speed)-> {
		System.out.println("The pilot name is ..:"+name);
		System.out.println("The speed is...:"+speed);
	};
	pilot.fly("shafi",1000);
}
}
interface Student{
	public void learn();
}	
interface Driver{
	public void drive(String s);
		
}
interface Pilot{
	public void fly(String name,int speed);
}
