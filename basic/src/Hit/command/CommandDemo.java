package Hit.command;

public class CommandDemo {
	public static void main(String[] args) {
		Police police=new Police();
		Health health=new Health();
		Corporation corporation=new Corporation();
				
				Seva myGovernment =new Seva();
		        Command dc=new DeathCommand(police,health,corporation);
		        myGovernment.setCommand(dc,1);
		        
		        myGovernment.executeSeva(0);
		        myGovernment.executeSeva(1);
	}
	}
	class Police{
		public void doInvestigation() {
			System.out.println("investigation done...");
		}
	}
	class Health{
		public void doPostMortem() {
			System.out.println("post mortem done...");
		}
	}
	class Corporation{
		public void doGiveCertificate(){
			System.out.println("death certificate done...");
		}    
	}
	interface Command{
		public void execute();
		}
	class DeathCommand implements Command{
		Police police;Health health;Corporation corporation;
		
		public DeathCommand(Police police,Health health,Corporation corporation) {
			this.police=police;
			this.health=health;
			this.corporation=corporation;
		}
		public void execute() {
			System.out.println("process of death certificate started by seva...");
			police.doInvestigation();
			health.doPostMortem();
			corporation.doGiveCertificate();
			System.out.println("now take the certificate.....");
		}
	}
	class DummyCommand implements Command{
		public void execute() {
		System.out.println("I am a dummy yet tom be operational..");
		}
	}
	class Seva{
		Command c[]=new Command[5];
		public Seva() {
			for(int i=0;i<c.length;i++) {
				c[1]=new DummyCommand();
			}
		}
		public void executeSeva(int slot) {
			c[slot].execute();
		}
		public void setCommand(Command c,int slot) {
			this.c[slot]=c;
}
	}
