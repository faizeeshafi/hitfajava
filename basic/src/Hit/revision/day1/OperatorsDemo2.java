package Hit.revision.day1;

public class OperatorsDemo2 {
public static void main(String[] args) {
	
	int x=10;
	int y=10;
	
	boolean result=x==y;
	System.out.println(result);
	System.out.println(x==y);
	System.out.println(x<y);
	System.out.println(x>y);
	System.out.println(x<=y);
	System.out.println(x>=y);
	System.out.println(x!=y);
	
	result=x<=10&& y>=20;
	System.out.println(result);
	
	result=x==10||y>=20;
	System.out.println(result);
}
}
