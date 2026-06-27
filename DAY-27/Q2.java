import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] empId = new int[150];
        String[] empName = new String[150];
        int[] Salary = new int[150];

        int count = 0;
        int choice = 0;

        while(choice!=4){
            System.out.println("Employee Management System.");
            System.out.println("1. ADD Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Select Employee");
            System.out.println("4. EXIT!");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter empId: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter empName: ");
                    empName[count] = sc.nextLine();
                    System.out.print("Enter Salary:");
                    Salary[count] = sc.nextInt();
                    count++;
                    System.out.println("Added Successfully!");
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("NO Employee Records Found.");
                    }else{
                        System.out.println("Employee Records: ");
                       for(int i=0;i<count;i++){
                         System.out.println("EmpId: " +empId[i]);
                         System.out.println("EmpName: " +empName[i]);
                         System.out.println("Salary: " +Salary[i]);
                       }
                    }
                        break;
                
                case 3:
                    System.out.print("Enter EmpId to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for(int i=0;i<count;i++){
                        if(searchId == empId[i]){
                            System.out.println("empID: " +empId[i]);
                            System.out.println("empName: " +empName[i]);
                            System.out.println("Salary: " +Salary[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Employee Not Found!");
                    }
                    break;
                
                case 4:
                    System.out.println("Exit!");
                    break;
                
                default:
                    System.out.println("Inavlid choice!");

            }
        }
    }

}