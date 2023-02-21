import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take input from user, S,P,R
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Please enter S,P or R");
        char userMove = inputObj.next().charAt(0);
        System.out.println("User gave this input>> "+userMove);


        // make computer to make there move
        char[] arr = {'S','R','P'};
        Random random = new Random();
        int guessNumber = random.nextInt(3);
        char computerMove =arr[guessNumber];
        System.out.println("Computer move >>" + computerMove);


        // computer = user -> draw!!!
        if(computerMove==userMove)
        {
            System.out.println("DRAW");
        }
        else if(computerMove=='R'&&userMove=='S'){
            System.out.println("Computer wins");
        }
        else if(computerMove=='S'&&userMove=='R'){
            System.out.println("User wins");
        }
        else if(computerMove=='P'&&userMove=='S') {
            System.out.println("User wins");
        }
        else if(computerMove=='S'&&userMove=='P'){
            System.out.println("computer wins");
        }
        else if(computerMove=='R'&&userMove=='P') {
            System.out.println("USER wins");
        }
            else if(computerMove=='P'&&userMove=='R'){
                System.out.println("computer wins");
            }

        else{
            System.out.println("There is error in this move.You must enter the right move");
        }
        // user "S"
        // computer "R" -: c wins!
        // user wins

        // user "P"
        // computer "R" -: U wins!
        // c wins

        // user "R"
        // computer "S" -: U wins!
        // computer wins
    }
}
