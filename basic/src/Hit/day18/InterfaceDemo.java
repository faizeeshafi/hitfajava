package Hit.day18;

public class InterfaceDemo {
public static void main(String[] args) {
	AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
	Doctor doctor=(Doctor)stanley;
	doctor.doCure();
	Nurse nurse=(Nurse)stanley;
	nurse.doNursing();
	
	HomeoPathyMedicalCollege homeoDoctor=new HomeoPathyMedicalCollege();
	Doctor doctor2=(Doctor)homeoDoctor;
	doctor2.doCure();
	Nurse nurse2=(Nurse)homeoDoctor;
	nurse2.doNursing();
	System.out.println(Doctor.i);
	
}
}
interface Doctor{
	public void doCure();
    final static int i=10;
	default public void met() {
		System.out.println("met called....");
	}
}
interface Surgeon extends Doctor{
	
}
interface Nurse{
	public void doNursing();
	class AlopathyMedicalCollege implements Doctor,Nurse{
		public void doNursing() {
			System.out.println("Nursing method called...");
		}
	public void doCure() {
		System.out.println("do cure method called...as per alopathy...");
	}
	}
	class HomeoPathyMedicalCollege implements Doctor{
		public void doCure() {
			System.out.println("do cure method called.. as per homeopathy...");
		}
	}
}
