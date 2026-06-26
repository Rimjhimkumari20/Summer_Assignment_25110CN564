import java.util.Scanner;

public class Q4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        int score = 0;
        System.out.println("Quiz Started!\n");
        
        // Question 1
        System.out.println("Which language is most easier?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C++");
        System.out.println("4. SQL");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        if(choice == 2){
            score++;
        }

        //Question 2
        System.out.println("Which language is used for Android Development?");
        System.out.println("1. java");
        System.out.println("2. Python");
        System.out.println("3. C++");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        if(choice == 1){
            score++;
        }

        //Questiom 3
        System.out.println("What is the capital of india?");
        System.out.println("1. Kolkata");
        System.out.println("2. Delhi");
        System.out.println("3. Mumbai");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        if(choice==2){
            score++;
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your score: " + score + "/3");
    }
    
}
