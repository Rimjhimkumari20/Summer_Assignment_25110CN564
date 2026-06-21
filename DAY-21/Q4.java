import java.util.Scanner;

public class Q4 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String in lower case:");

        String name = sc.nextLine().toLowerCase();
        String upper = name.toUpperCase();

        System.out.println("Uppercase String: " +upper);
    }
}