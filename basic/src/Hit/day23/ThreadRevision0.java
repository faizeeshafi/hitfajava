package Hit.day23;

public class ThreadRevision0 {
public ThreadRevision0(){
	Thread t=new Thread();
	t.start();
}
public static void main(String[] args) {
	new ThreadRevision0();
	Thread t=Thread.currentThread();
	System.out.println(t);
	for(int i=5;i<5;i++) {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		System.out.println(i);
	}
}
}
