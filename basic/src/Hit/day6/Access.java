package Hit.day6;

public class Access {
public int pub;
protected int pro;
int nomod;
private int pri;
void met() {
	System.out.println(pub);
	System.out.println(pro);
	System.out.println(nomod);
	System.out.println(pri);
}
}
class AccessSubClass extends Access{
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(obj.nomod);
		System.out.println(obj.pri);
	}
}