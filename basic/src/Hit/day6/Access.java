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
	System.out.println(getPri());
}
public int getPri() {
	return pri;
}
public void setPri(int pri) {
	this.pri = pri;
}
}
class AccessSubClass extends Access
{
void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(getPri());
	}
}
class AccessNonSubClass {
	void met() {
		Access obj=new Access();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
		System.out.println(obj.getPri());
	}
}
