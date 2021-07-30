package Hit.day36;

public class LockDemo {
	public static void main(String[] args) {
		CounsellingHall anna=new CounsellingHall();
		new Thread(()->{anna.table1();anna.table2();},"ramu").start();
		new Thread(()->{anna.table1();},"somu").start();
		new Thread(()->{anna.water();},"basha").start();
	}
}
class CounsellingHall{
	synchronized public void table1(){
		System.out.println("in table 1...."+Thread.currentThread().getName());
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Finished the work in table 1"+Thread.currentThread().getName());
		}
	public void table2() {
			System.out.println("in table 2...."+Thread.currentThread().getName());
			try {Thread.sleep(5000);}catch(Exception e) {}
			System.out.println("finished the work in table 1'"+Thread.currentThread().getName());
	}

public void water() {
	System.out.println("drinking wtaer......."+Thread.currentThread().getName());
	try {Thread.sleep(1000);}catch(Exception e) {}
	System.out.println("Finished drinking water ....."+Thread.currentThread().getName());
}
}