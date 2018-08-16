import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String keepGoing = null;
		
		do {
			System.out.println("Let's locate some primes!");
			System.out.println("This application will find you any prime, in order, from first prime number on.");
			System.out.println("Which prime number are you looking for? ");
			int n = scan.nextInt();
			System.out.println("The number " + n + " prime is " + Prime.answer(n));
			
			System.out.println("Do you want to find another prime number? (y/n)");
			keepGoing = scan.nextLine();
		} while (keepGoing.equalsIgnoreCase("y"));
		
		System.out.println("Tchau!");
		
		scan.close();
	}

}
