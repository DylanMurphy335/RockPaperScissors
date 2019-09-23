import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	enum handsign {Rock, Paper, Scissors};

	void blurb() {
		System.out.println("========================");
		System.out.println("===paper covers rock ===");
		System.out.println("==scissors cuts paper ==");
		System.out.println("= rock breaks scissors =");
		System.out.println("========================");
	}

	void userInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("\nLets play...");
		System.out.println("PLease enter 'rock', 'paper' or 'scissors' ['quit' to exit]:");
		String choice = s.next();
		//system.out.println(choice);
		// to check code as i go

	}

	void playGame(String userInput) {
		Random r = new Random();
		int num = 1 + r.nextInt(3);

		handsign user = handsign.Paper;
		handsign computer = handsign.Scissors;
		//System.out.println(num);
		//to check code as i go
		switch (userInput) {
			case "quit" :
				System.out.println("\nGood Bye.");
				System.exit(0);
				break;
			case "scissors" :
				user = handsign.Scissors;
				break;
			case "paper" :
				user = handsign.Paper;
				break;
			case "rock" :
				user = handsign.Rock;
				break;
			default :
				System.out.println("\nInvalid input");
				System.exit(0);
				break;
		}

		if(num == 1) {
			computer = handsign.Rock;
			System.out.println("Rock");
		}
		else
			if ( num == 2) {
			computer = handsign.Paper;
			System.out.println("Paper");
			}
			else {
				computer = handsign.Scissors;
				System.out.println("Scissors");
			}
		checkResult(user, computer);
	}

	void checkResult(handsign user, handsign computer) {

		if ( computer == user ) {
			System.out.println("its a tie!");
			System.exit(0);
		}
		else
			if (computer == handsign.Paper && user == handsign.Rock) {
				System.out.println("You win.");
			}
			else
				if (computer == handsign.Paper && user == handsign.Scissors) {
					System.out.println("You Lose.");
				}
				else
					if (computer == handsign.Scissors && user == handsign.Paper) {
						System.out.println("You Win. great job!");
					}
					else
						if (computer == handsign.Scissors && user == handsign.Rock) {
								System.out.println("You Lost.");
							}
						else
							if (computer == handsign.Rock && user == handsign.Scissors) {
								System.out.println("You lost this time. Try again!");
							}
							else
								if (computer == handsign.Rock && user == handsign.Paper) {
									System.out.println("You Won Congratulations!");
								}
	}

	public static void main(String[] args) {
		RockPaperScissors app = new RockPaperScissors();
	}

}
