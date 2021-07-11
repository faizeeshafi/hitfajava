package Hit.day13;
import java.util.Scanner;
public class GoodFanDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    GoodFan khaitan=new GoodFan();
while(true) {
	System.out.println("Press a key and then Enter for pulling chain");
scan.next();
khaitan.pull();
}
}
}
class GoodFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State{
	public void pull(GoodFan fan) {
		System.out.println("SwitchOnState...");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	public void pull(GoodFan fan) {
		System.out.println("high speed state.......");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("switch off state...");
		fan.state=new SwitchOffState();
	}
	
}
class BadFan{
	int state;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
		state=0;
		}
		else if(state==1) {
			System.out.println("Medium speed state...");
		state=2;
	    }
	    else if(state==2) {
		System.out.println("High speed state...");
		state=3;
	    }
		else if(state==3) {
			System.out.println("switch off state..");
			state=0;
		}
	}
}