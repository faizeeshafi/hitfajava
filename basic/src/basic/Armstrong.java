package basic;

public class Armstrong {
	public static void main(String[] args) {
		int number = 371, originalNumber, reminder, result = 0;
		originalNumber = number;
		while (originalNumber != 0)
		{
			int remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}
		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}

}
