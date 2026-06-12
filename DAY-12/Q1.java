import java.util.Scanner;

public class Q1 {
    public static int Palindrome(int n){
        int r,rev=0;
        int num = n;
        while(num!=0){
        r=num%10;
        rev=rev*10+r;
        num=num/10;
        }
     return rev;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int rev = Palindrome(n);
        if(rev==n){
            System.out.print(n+ " IS A Palindrome Number");
        }
        else{
            System.out.print("NOT A Palindrome Number");
        }
    }
    
}
