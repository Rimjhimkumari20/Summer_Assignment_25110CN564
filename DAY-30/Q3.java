import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[20];
        String[] name = new String[20];
        double[] salary = new double[20];

        int count = 0, choice;
        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added.");
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + id[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Salary: " + salary[i]);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == search) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int update = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (id[i] == update) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary Updated.");
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