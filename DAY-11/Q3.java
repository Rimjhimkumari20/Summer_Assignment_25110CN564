import java.util.Scanner;

public class Q3 {
    public static int CheckPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
    }
     return c;
}
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int n = sc.nextInt();
    int c = CheckPrime(n);
    if(c==2){
        System.out.print(n+ " Is Prime Number");
    }
    else{
        
        System.out.print("NOT A Prime Number");
    }
  }
}

