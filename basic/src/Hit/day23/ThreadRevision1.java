package Hit.day23;

public class ThreadRevision1 {
public ThreadRevision1() {
	Thread t=new Thread(new ThreadJob());
	t.start();
}
public static void main(String[] args) {
	new ThreadRevision1();
	Thread T=Thread.currentThread();
	for(int i=0;i<5;i++) {
		System.out.println(i);
		try {
	}catch(Exception e) {
}
}
}
class ThreadJob implements Runnable{
	public void run() {
		System.out.println("Child thread is executed");
	}
}
}