import java.util.Scanner;

public class Q4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String name = sc.nextLine();

        String result = "";

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
               result+= name.charAt(i);
            }
        }

        System.out.println("String After Removing Spaces: " +result);

    }
}