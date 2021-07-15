package Hit.revision.day2;

public class BreakAndContinue {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				break;
				
			}
			System.out.println(i);
		}
		boolean b=true;
		a:{
			System.out.println("a block...");
			b:{
				System.out.println("b block...");
				c:{
					if(b) {break a;}
					System.out.println("c block...");
				}
			}
		}
		
	}

	
}


