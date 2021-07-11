package Hid.day16;
import java.lang.reflect.Field;
public class ReflectionDemo5 {
	public static void main(String[] args)throws Exception {
		Employee emp=new Employee();
		Class c=emp.getClass();
		Field f=c.getField("name");
		f.set(emp, "ramu");;
		System.out.println("The value set was..:"+f.getByte(emp));
		
	} 

}
class Employee{
	public String name;
	public int age;
}