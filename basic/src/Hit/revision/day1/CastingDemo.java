package Hit.revision.day1;

public class CastingDemo {
public static void main(String[] args) {
	
	byte b=100;//8 bit
	short s=b;//16 bit
	int i=s;//32 bit
	long l=i;//64 bit
	
	long ll=257;//64 bit
	System.out.println("Long Data...:+ll");
	int ii=(int)ll;
	System.out.println("int data...:"+ii);
	short ss=(short)ii;
	System.out.println("short data...:"+ss);
	byte bb=(byte)ss;
	System.out.println("byte data...:"+bb);
	
	byte mybyte1=10;
	byte mybyte2=2;
	byte result=(byte)(mybyte1*mybyte2);
	System.out.println(result);
	double d=12.34;//64 bit
	System.out.println("Double value is...:"+d);
	float f=(float)d;//32 bit
	System.out.println("Float value is..."+f);
	
	int myint=(int)f;
	System.out.println("myint of float value ...:"+myint);
}
}
