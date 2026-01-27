import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    void main(){
        // RockPaperScissors game
        Scanner scanner = new Scanner(System.in);
        Random random =new Random();

        String option; // option given to user to continue
        String systemMove, userMove; // moves for both system and the user
        String[] moves = {"rock","paper","scissors"}; // all legal moves

        //loop starts
        do {
            System.out.print("Enter your move: ");
            userMove=(scanner.nextLine()).toLowerCase(); // user move input

            if(!Arrays.asList(moves).contains(userMove)){ // check for invalid input
                System.out.println("Invalid Move");
                break;
            }

            systemMove=moves[random.nextInt(3)]; // setting random input from system
            System.out.println("System's move: " + systemMove);

            if(userMove.equals(systemMove)){ // game logic
                System.out.println("Draw");
            } else if (((userMove.equals("rock"))&&(Objects.equals(systemMove, "scissors")))
                     ||((userMove.equals("paper"))&&(Objects.equals(systemMove, "rock")))
                     ||((userMove.equals("scissors"))&&(Objects.equals(systemMove, "paper")))) {
                System.out.println("Winrar");
            } else if (((userMove.equals("rock"))&&(Objects.equals(systemMove, "paper")))
                    ||((userMove.equals("paper"))&&(Objects.equals(systemMove, "scissors")))
                    ||((userMove.equals("scissors"))&&(Objects.equals(systemMove, "rock")))){
                System.out.println("You lost");
            }
            System.out.print("Do you wanna continue?: ");
            option=(scanner.nextLine()).toLowerCase(); // input option
        }while (option.equals("yes"));
    }
}
