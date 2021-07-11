package Hit.day27;

public class GenericsDemo1 {
	public static void main(String[] args) {
		Paint paint=new RedPaint();
		
		Powder powder=new RosePowder();
		
		GoodPaintBrush<Paint> brush=new GoodPaintBrush<>();
		
		brush.setObj(paint);
		
		Paint mypaint=brush.getObj();
		mypaint.color();
		
		GoodPaintBrush<Powder> brush2=new GoodPaintBrush<>();
		brush2.setObj(new RosePowder());
		
		Powder myPowder=brush2.getObj();
		myPowder.doMakeup();
		
		
	}
}
abstract class Paint{
	public abstract void color();
}
class RedPaint extends Paint{
	public void color() {
		System.out.println("red colour...");
	}
}
class BluePaint extends Paint{
	
	public void color() {
		System.out.println("blue colour...");
	}
}
abstract class Powder{
	public abstract void doMakeup();
}
class WhitePowder extends Powder{
	public void doMakeup() {
		System.out.println("applying powder....");
	}
}
class RosePowder extends Powder{
	
	public void doMakeup() {
		System.out.println("rose powder applied..");
	}
}
class GoodPaintBrush<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return this.obj;
	}
}
class BadPaintBrush3{
	Object obj; 
	public void execute() {
		if(obj instanceof Paint) {
			Paint paint=(Paint)obj;
			paint.color();
		}
		if(obj instanceof Powder) {
			Powder makeup=(Powder)obj;
			makeup.doMakeup();
		}
	}
	
}
class BadPaintBrush2{
	Paint paint; 
	public void doPaint() {
		System.out.println(paint);
	}
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			RedPaint rp=new RedPaint();
			System.out.println("red paint...."+rp);
		}
		else if(i==2) {
			BluePaint bp=new BluePaint();
			System.out.println("blue paint...:"+bp);
		}
	}
}

