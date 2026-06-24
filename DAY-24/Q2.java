import java.util.Scanner;

public class Q2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<name.length();i++){
            int count = 1;

            while(i<name.length()-1 && name.charAt(i) == name.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(name.charAt(i));
            sb.append(count);
        }

        System.out.println("Compressed String: " +sb);

    }
}