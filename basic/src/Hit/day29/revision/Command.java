package Hit.day29.revision;

public interface Command {
	public void execute();
}
class DeathCertificate implements Command{
	MedicalDepartment hospital;PoliceDepartment police;Corporation coporation;
public DeathCertificate(MedicalDepartment md,PoliceDepartment pd,Corporation c) {
	this.hospital=md;
	this.police=pd;
	this.coporation=c;
}
public void execute() {
	System.out.println("set of instruction to carry out the command death certificate...");
	System.out.println("started the work ...to get the death certificate...");
	police.enquiry();
	hospital.doPostMortem();
	hospital.deathDeclaration();
	coporation.deathCertificate();
	System.out.println("Take the death certificate...");
}
}
class HotelOpeningCertificate implements Command{
	HealthDepartment health;PoliceDepartment police;Corporation coporation;
	public HotelOpeningCertificate(Healthdepartment md,PoliceDepartment pd,Corporation c) {
		this.health=md;
		this.police=pd;
		this.coporation=c;
	}
	public void execute() {
		System.out.println("set of instruction to carry out the command open hotel certificate...");
		System.out.println("started the work... to get hotel certificate...");
		health.healthcertificate();
		police.clearance();
		coporation.hotelCertificate();
		System.out.println("take the open hotel command...");
	}
}
