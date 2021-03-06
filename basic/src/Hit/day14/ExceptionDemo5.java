package Hit.day14;

import java.util.Scanner;

public class ExceptionDemo5 {
public static void main(String[] args) {
	Dog tiger=new Dog();
	Child baby=new Child();
	Item item=new Biscuit();		
	baby.PlayWithDog(tiger, item);
}
}
class DogExceptions extends Exception	{

}
class DogBiteException extends DogExceptions{
String msg;
public DogBiteException(String msg) {
	this.msg=msg;
}

public String toString() {
	return "Exception is...:"+msg;
}
}
class DogHappyException extends DogExceptions{
String msg;
public DogHappyException(String msg) {
	this.msg=msg;
}
@Override
public String toString() {
	return "Exception is...:"+msg;
}
}
abstract class Item{
	public abstract void execute()throws DogBiteException,DogHappyException;
}
class Stick extends Item{
	public void execute()throws DogBiteException {
		throw new DogBiteException("You beat I bite.....");
	}
}
class Biscuit extends Item{
		public void execute() throws DogHappyException {
		throw new DogHappyException("I love biscuits....");
	}
}
class Dog{
public void play(String item)throws DogBiteException,DogHappyException {
	if(item.equals("stick")) {
		throw new DogBiteException("You beat I bite....");
	}
	else if(item.equals("biscuit")) {
		throw new DogHappyException("I love biscuits....");
	}
}
}
class Child{
public void playWithDog(Dog tiger,String item) {
	try{
		tiger.play(item);
	}catch(DogBiteException dbe) {
		System.out.println(dbe);
	}catch(DogHappyException dhe) {
		System.out.println(dhe);
	}
}
}