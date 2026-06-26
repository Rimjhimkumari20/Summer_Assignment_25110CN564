import java.util.Random;
import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int guess = -1;

        System.out.println("Guess a number between 1 and 100");

        while(guess!=secretNumber){
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess>secretNumber){
                System.out.println("TOO high! Try Again.");
            }else if(guess<secretNumber){
                System.out.println("TOO Low! Try Again!");
            }else{
                System.out.println("Congratulation! You guessed the correct number.");
            }
        }
    }
}