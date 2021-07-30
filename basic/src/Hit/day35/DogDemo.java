package Hit.day35;

public class DogDemo {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		baby.playWithDog("stick",tiger);
	}

}
abstract class DogExceptions extends Exception{
	public abstract void visit();
}
class DogBiteException extends DogExceptions{
	public void visit() {
		new Handler().handle(this);
	}
}
class DogBarkException extends DogExceptions{
	public void visit() {
		new Handler().handle(this);
	}
}
class Dog{
	public void play(String item)throws DogExceptions{
		if(item.equals("stick")){
			throw new DogBiteException();
		}
		else if(item.equals("stone")) {
			throw new DogBarkException();
		}
	}
}
class Child{
	public void playWithDog(String item,Dog dog) {
		try {
			dog.play(item);
		}catch(DogExceptions e) {
			e.visit();
		}
	}
}
class Handler{
	public void handle(DogBiteException de) {
		System.out.println("Dog has bitten...take him to hospital...");
	}
	public void handle(DogBarkException dre) {
		System.out.println("dont worry...just stay still..");
	}
}
