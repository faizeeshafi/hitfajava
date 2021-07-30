package Hit.day35;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		ExcepDemo obj=new ExcepDemo();
		try {
			obj.raise("shafiudeen");
		}catch(CustomException ce) {
			System.out.println(ce);
		}
	}

}
class CustomException extends Exception{
	private String msg;
	public CustomException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return "The Exception is ...:"+msg;
	}
}
class ExcepDemo{
	public void raise(String name)throws CustomException{
		if(name.equals("shafiudeen")) {
			throw new CustomException("shafiudeen shafiudeen shafiudeen.....come come come...");
	}
	else if(name.equals("shafiudeen")) {
		throw new CustomException("shafiudeen shafiudeen shafiudeen...come come come...");
	}
}
}

	

	
