import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		
		int secretNumber;
		secretNumber = (int) (Math.random() * 99 + 1);
		System.out.println("Secrect number is" + secretNumber);
		
		Scanner keyboard = new Scanner(System.in);
		int guess;
		do {
		System.out.print("Enter a guess: ");
		guess = keyboard.nextInt();
		System.out.println("Your guess is " + guess);
		
		if (guess == secretNumber)
			System.out.println("Your guess is correct. Congratulations!");
		else if (guess < secretNumber)
			System.out
						.println("Your guess is smaller than the secret number.");
		else if (guess > secretNumber)
				System.out
						.println("Your guess is greater than the secret number.");
		
	} while (guess != secretNumber);
}
}
		
		
		
				
			
				
			


