import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int maxCount = 0;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > maxCount) {
                maxCount = count[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}