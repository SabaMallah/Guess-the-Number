import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100)+1;

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
        System.out.println("Enter you guess: ");

        while(guess != randomNumber){
            if(guess > randomNumber){

            }
            if(guess < randomNumber){

            }
            else{

            }
        }

    }
}
