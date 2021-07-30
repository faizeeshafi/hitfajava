package Hit.day38;

public class SingletonDemo {
	public static void main(String[] args) {
		new Thread(()->{Single.createSingleObject();}).start();
		new Thread(()->{Single.createSingleObject();}).start();

	}

}
class Single{
	private Single() {
		System.out.println("object of single is created....");
	}
	private static Single single;
	synchronized public static Single createSingleObject(){
		if(single==null) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			single=new Single();
		}
		return single;
	}
}