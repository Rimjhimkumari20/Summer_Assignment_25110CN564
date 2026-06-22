import java.util.Scanner;

public class Q2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");

        String name = sc.nextLine();
        int c = 1;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                c++;
            }
        }

        System.out.print("Number of Words = " +c);
    }
}
