package Hit.day29.revision;

public class SevaDepartment {
	Command command[]=new Command[5];
	public SevaDepartment() {
		for(int i=0;i<5;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
	public void setCommand(Command c,int slot) {
		command[slot]=c;
	}
	class DummyCommand implements Command{
		public void execute() {
			System.out.println("I am dummy yet to be operational..");
		}
	}
	class MedicalDepartment{
		public void doPostMortem() {
			System.out.println("post mortem of the body done,..");
		}
		public void deathCertificate() {
			System.out.println("death certificate done..");
		}
	}
	class PoliceDepartment {
	public void enquiry() {
		System.out.println("enquiry done...");
	}
	public void clearance() {
		System.out.println("clearance given...");
	}
	}
	class Corporation{
		public void deathcertificate() {
			System.out.println("hotel certificate given...");
		}
	}
	class HealthDepartment{
		public void healthCertificate() {
			System.out.println("hotel certificate given...");
	}
	}
	}


