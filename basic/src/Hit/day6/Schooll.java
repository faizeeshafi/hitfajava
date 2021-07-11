package Hit.day6;

public class Schooll {
	int i=10;
	void admission() {
		System.out.println("Admission Done...");
	}
	int feesPayment(int money)
	{
		System.out.println("Accept money from you as fees");
		System.out.println("He returns the change...");
		if(money>500) {
			return money-200;
		}
		else if(money==500)
		{
			return money-150;
		}
			else {
				return money-100;
			}
		}
		int askDonation()
		{
			return 100;
		}
		public static void main(String[] args)
		{
			Schooll obj=new Schooll();
			int money =obj.feesPayment(1000);
			System.out.println("The balance is...:"+money);
			
		}
}
			






