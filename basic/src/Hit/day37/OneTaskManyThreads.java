package Hit.day37;

public class OneTaskManyThreads {
	public static void main(String[] args) {
		Drama melody=new Drama();
		
		new Thread(()->{
			for(int i=0;1<5;i++) {
				melody.emotions();
			}
			
		}).start();
		
		new Thread(()->{
			for(int i=0;i<5;i++) {
				melody.comedy();
			}
		}).start();
	}

}
class Drama{
	boolean signal;
	synchronized public void emotions() {
		if(signal) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Emotional scene...");
		signal=true;
		notify();
	}
	synchronized public void comedy() {
		if(!signal) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("comedy scene.....");
		signal=false;
		notify();
	}
}
