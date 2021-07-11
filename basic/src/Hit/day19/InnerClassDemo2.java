package Hit.day19;

public class InnerClassDemo2 {
public static void main(String[] args) {
	Kali2 kalimark=new Kali2();
	kalimark.sellCola();
	
	Pepsi2 pepsico=new Pepsi2();
	pepsico.sellCola();
}
}
interface Cola2{
	public void makeCola();
}
class Pepsi2{
	public void sellCola() {
}
}
class Kali2{
	public void sellCola(){
		class CampaCola implements Cola{
			public void makeCola() {
				System.out.println("Cola made by campa cola..");
			}
		}
		new Cola2() {
			
			public void makeCola() {
				System.out.println("Cola made by campa cola...");
			}
		
}.makeCola();
Cola2 cc=new Kali2()::makeKaliCola;
cc.makeCola();
Cola2 ccc=()->{System.out.println("Coa made by campa cola...using lambda...");};
ccc.makeCola();
System.out.println("kali fills campa cola in bovonto bottle and sell...");
	}
	private void makeKaliCola() {
		System.out.println("cola made by using campa cola formula....");
	}
	public Cola thief() {
		return new CampaCola();
	}
	private class CampaCola implements Cola{
		public void makeCola() {
			System.out.println("Cola made by campa cola...");
		}
	}
	}
