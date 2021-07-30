package Hit.day36;

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("first line...");
		System.out.println("sec line...");
		new Thread(new MyRunnable()).start();
		System.out.println("fourth line...");
	}
	public void met() {
		try {Thread.sleep(5000);}catch(Exception e){}
		System.out.println("third line...");
	}

}
class MyRunnable implements Runnable{
	public void run() {
		new ThreadDemo2().met();
	}
}
