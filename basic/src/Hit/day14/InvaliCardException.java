package Hit.day14;

public class InvaliCardException extends Exception{
	String msg;
	public void InvalidCardException(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return "Exception is..:"+msg;
	}
}
