import java.util.Scanner;

public class Q2{
    public static int Maximum(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Two Number:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = Maximum(a,b);
    System.out.print("Maximum Number = " +result);
  }
 }
    

