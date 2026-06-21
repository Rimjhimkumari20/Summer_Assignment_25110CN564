import java.util.Scanner;

public class Q2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Characters:");

        String name = sc.nextLine();

        char[] ch = name.toCharArray();
        int start = 0, end = name.length()-1;

            while(start<end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }

        String rev = new String(ch);
        System.out.println("Reversed String : " +rev);
    }
}
