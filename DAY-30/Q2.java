import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[20];
        String[] bookName = new String[20];
        boolean[] issued = new boolean[20];

        int count = 0, choice;

        do {
            System.out.println("\n--- Mini Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added.");
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println("Book ID: " + bookId[i]);
                        System.out.println("Book Name: " + bookName[i]);

                        if (issued[i])
                            System.out.println("Status: Issued");
                        else
                            System.out.println("Status: Available");

                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == id) {
                            issued[i] = true;
                            System.out.println("Book Issued.");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == id) {
                            issued[i] = false;
                            System.out.println("Book Returned.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}
