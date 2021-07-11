package Hit.day22;

import java.util.Date;

public class ThreadDemo2 {
public static void main(String[] args)throws Exception {
VaccinationCenter vc=new VaccinationCenter();
Thread t=Thread.currentThread();
t.setName("shafi");
System.out.println(new Date());
System.out.println("Before comming to class...");
Thread Khathoon=new Thread(new JobToKhathoon(vc),"khathoon");
Khathoon.start();
System.out.println("Take class....7-9 Golden Btach...."+new Date());

}
}
class JobToKhathoon implements Runnable{
	VaccinationCenter vc;
	public
	JobToKhathoon(VaccinationCenter vc) {
		this.vc=vc;
	}
	public void run() {
		System.out.println("The job given to khathoon is executed from this method...");
		try {
			vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	class VaccinationCenter{
		public void getToken()throws Exception{
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println(name+"...standing in queue for token...");
			Thread.sleep(10000);
			System.out.println("token received..."+new Date());
		}
	}
	
}
