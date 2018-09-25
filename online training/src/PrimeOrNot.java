import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number to know weather it is prime or not!");
		int a = in.nextInt();
		int i;
		boolean isprime = true;
		for (i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				isprime = false;
				break;
			}

		}
		if (isprime) {

			System.out.println(a + " is prime number");
		} else {
			System.out.println(a + " is not a prime number");
		}
	}
}