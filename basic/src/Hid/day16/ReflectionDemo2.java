package Hid.day16;

public class ReflectionDemo2 {
public static void main(String[] args)throws Exception {
	Politician p=new AbcPolitician("ramu","father ramu");
	System.out.println(p);
	p=(Politician)Class.forName("Hit.day16.AbcPolitician").getConstructor(new Class[]{String.class,String.class}).newInstance("dynamicramu","dynamic father ramu");
					
	
			System.out.println("dynamic ramu...:"+p);
			p=(Politician)Class.forName("hit.day16.AbcPolitician")
				
					.getConstructor(String.class,String.class).newInstance("new dynamicramu","new father dynamic ramu");
			
			         System.out.println("new dynamic ramu...:"+p);
			
}
}
abstract class Politician{
	
}
class AbcPolitician extends Politician{
	String name;String fname;
	public AbcPolitician(String name,String fname) {
		this.name=name;this.fname=fname;
	}
	public String toString() {
		return"The object is...:"+this.name+":"+this.fname;
	}
}
class XyzPolitician extends Politician{
	
}