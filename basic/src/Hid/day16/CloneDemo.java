package Hid.day16;

public class CloneDemo {
public static void main(String[] args) {
	Sheep mothersheep=new Sheep();
	mothersheep.name="I am the mother sheep...";
	
	Sheep dolly=mothersheep.createClone();
	dolly.name="I am the clone dolly...";
	System.out.println("Mother name...:"+mothersheep.name);
	System.out.println("Clone Name....:"+dolly.name);
}
}
class Sheep implements Cloneable{
	public Sheep() {
		System.out.println("Sheep object created...");
	}
	public String name;
	
	public Sheep createClone() {
	try {
		return (Sheep)super.clone();
	}catch(CloneNotSupportedException cne) {
		cne.printStackTrace();
		return null;
	}
}
}
