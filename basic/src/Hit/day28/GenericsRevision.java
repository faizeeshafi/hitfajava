package Hit.day28;

public class GenericsRevision {
	public static void main(String[] args) {
		Child3<Ball> child3=new Child3<>();
		child3.setObj(new Ball());
		child3.getObj().play();
		
		Child3<Sweet> child33=new Child3<>();
		child33.setObj(new Sweet());
		child33.getObj().eat();
	}
}
class Ball{
	public void play() {
		System.out.println("playing with the ball...");
	}
}
class Sweet{
	public void eat() {
		System.out.println("eating the sweet....");
	}
}
class Child{
	Ball ball;
	public void action() {
		ball.play();
	}
}
class Child2{
	Object obj;
	public void action() {
		if(obj instanceof Ball) {
			Ball ball=(Ball)obj;
			ball.play();
		}
		else if(obj instanceof Sweet) {
			Sweet sweet=(Sweet)obj;
			sweet.eat();
		}
	}
}
class Child3<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return this.obj;
	}
}

