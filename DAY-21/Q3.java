import java.util.Scanner;

public class Q3{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");

        String name = sc.nextLine().toLowerCase();
        int v = 0;
        int c = 0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o' || ch=='u'){
                    v++;
                }else{
                    c++;
                }
            }

        }
        System.out.println("Number of Vowels: " +v);
        System.out.print("Number of Consonants: " +c);
    }
}