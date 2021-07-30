package Hit.day36;

public class ThreadDemo3 {
	public ThreadDemo3() {
		System.out.println("cons called..");
		new Thread(new Runnable1()).start();
	}
	public static void main(String[] args) {
		System.out.println("main thread line 1");
		new ThreadDemo3();
		try {Thread.sleep(1);;}catch(Exception e) {}
		System.out.println("main thread line 2...");
	}

}
class Runnable1 implements Runnable{
	public void run() {
		System.out.println("child thread called...");
	}
}
