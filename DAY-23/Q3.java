import java.util.Arrays;
import java.util.Scanner;

public class Q3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagrams");
        }else{
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2))
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }
    }
}
