import java.util.Scanner;

public class Q3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String name = sc.nextLine();

        char[] ch = name.toCharArray();
        boolean[] visit = new boolean[ch.length];

        for(int i=0;i<name.length();i++){
            if(visit[i])
                continue;

            int c = 0;
            for(int j=0;j<name.length();j++){
                if(ch[i]==ch[j]){
                    c++;
                    visit[j] = true;
                }
            }

        System.out.println(ch[i]+ "= " +c);

        }
    }
}
