import java.util.Scanner;

public class Q4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String name = sc.nextLine();
        String result = "";

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if(result.indexOf(ch)==-1){
                result+= ch;
            }
        }

        System.out.println("After removing duplicates: " +result);
    }
    
}
