import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        char[] ch = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(int i=0;i<str1.length();i++){
            if(str1.indexOf(ch[i])!=i){
                continue;
            }
            for(int j=0;j<str2.length();j++){
                if(ch[i]==ch2[j]){
                    System.out.print(ch[i]+ " ");
                    break;
                }
            }
        }
    }
    
}
