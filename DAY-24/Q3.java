import java.util.Scanner;

public class Q3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String name = sc.nextLine();
        String word = "";
        String longest = "";

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if(ch!=' '){
                word+= ch;
            }else {
                if(word.length()>longest.length()){
                    longest = word ;
                }
             word = "";
            }

        }

        if(word.length()>longest.length()){
            longest = word;
        }
    System.out.print("Longest word: " +longest);
    }
}