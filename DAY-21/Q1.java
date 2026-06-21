import java.util.Scanner;

public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Characters:");

        String name = sc.nextLine();

        int c = 0;

        for(char ch : name.toCharArray()){
                  c++;
        }

        System.out.println("Length of the string: " +c);
    }
}