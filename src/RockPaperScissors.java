import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("Rock,Paper, or Scissors? ;)");
        String playerChoice = scanner.next().toLowerCase();

        String[] computerChoices = {"rock", "paper", "scissors"};
        int randomIndex = (int) (Math.random() * computerChoices.length);
        String computerChoice = computerChoices[randomIndex];

        System.out.println("Player: " + playerChoice);
        System.out.println("Computer: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        System.out.println("Play again? (y/n)");
        String answer = scanner.next().toLowerCase();
        if (!answer.equals("y")) {
            break;
        }
//    }
//    }
    }

    }
}
