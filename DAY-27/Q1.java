import java.util.Scanner;

public class Q1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] rollno = new int[150];
        String[] name = new String[150];
        double[] marks = new double[150];

        int count = 0;
        int choice=0;

        while(choice !=4){
            System.out.println("Student Record Management System.");
            System.out.println("1. ADD Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit!");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Rollno: ");
                    rollno[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    name[count] = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();
                    count++;
                    System.out.println("Student Record added Successfully.");
                    break;
                
                case 2:
                    System.out.println("Student Records: ");
                    for(int i=0;i<count;i++){
                        System.out.println("Rollno: " +rollno[i]);
                        System.out.println("Name: " +name[i]);
                        System.out.println("Marks: " +marks[i]);
                    }
                        break;

                case 3:
                    System.out.print("Enter RollNo to Search: ");
                    int SearchRollno = sc.nextInt();
                    boolean found = false;

                    for(int i=0;i<count;i++){
                        if(rollno[i] == SearchRollno){
                            System.out.println("Student Found:");
                            System.out.println("Rollno: " +rollno[i]);
                            System.out.println("Name: " +name[i]);
                            System.out.println("Marks: " +marks[i]);

                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Exit!");
                    break;
                
                default:
                    System.out.println("Invalid choice!");

                }

            }
        }

    }