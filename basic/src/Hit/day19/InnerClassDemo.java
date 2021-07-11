package Hit.day19;

public class InnerClassDemo {
public static void main(String[] args) {
	Kali kalimark=new Kali();
	kalimark.sellCola();
	
	Pepsi pepsico=new Pepsi();
	pepsico.sellCola();
}
}
interface Cola{
	public void makeCola();
}
class Pepsi{
	public void sellCola() {
		Cola cc=new Kali().thief();
		cc.makeCola();
		System.out.println("Pepsi fills campa cola in pepsi bottle and sell...");
	}
}
class Kali{
	public void sellCola() {
		class CampaCola implements Cola{
			public void makeCola() {
				System.out.println("Cola made by campa cola... ");
			}
			
		}
		CampaCola cc=new CampaCola();
		cc.makeCola();
		System.out.println("Kali fills campa cola in Bovonto bottle and sell... ");
			
		}
	public Cola thief(
			) {
		return new CampaCola();
	}
		private class CampaCola implements Cola{
		public void makeCola() {
			System.out.println("Cola made by campa cola...");
		}
	}
	}
