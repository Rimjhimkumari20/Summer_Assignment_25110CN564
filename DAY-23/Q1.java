import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String name = sc.nextLine();

        int[] count = new int[256];

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            count[ch]++;
        }

        boolean found = false;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if(count[ch]==1){
                System.out.println("First non-repeating character: " +ch);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No non-repeating character found.");
        }
    }
}