import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] roll = new int[100];
        String[] name = new String[100];
        String[] courses = new String[100];
        int[] cgpa = new int[100];

        int choice = 0;
        int count = 0;

        while(choice!=4){
            System.out.println("--Student Record System--");
            System.out.println("1. ADD New Student Records");
            System.out.println("2. View All Student Records");
            System.out.println("3. Search Student by RollId");
            System.out.println("4. EXIT!");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter RollNo: ");
                    roll[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name[count]= sc.nextLine();
                    System.out.print("Enter courses: ");
                    courses[count]= sc.nextLine();
                    System.out.print("Enter Cgpa: ");
                    cgpa[count] = sc.nextInt();
                    count++;
                    System.out.println("Record added succesfully!");
                    break;

                case 2:
                    if(count==0){
                        System.out.println("NO Records Found!");
                    }else{
                     for(int i=0;i<count;i++){
                        System.out.println("Rollno: " +roll[i]);
                        System.out.println("Name: " +name[i]);
                        System.out.println("Course: " +courses[i]);
                        System.out.println("CGPA: " +cgpa[i]);
                      }
                    }
                    break;

                case 3:
                    System.out.print("Enter RollNo to Search: ");
                    int SearchId = sc.nextInt();
                    boolean found = false;
                    for(int i=0;i<count;i++){
                        if(SearchId==roll[i]){
                            System.out.println("Student Found.");
                            System.out.println("Roll: " +roll[i]);
                            System.out.println("Name: " +name[i]);
                            System.out.println("Course: " +courses[i]);
                            System.out.println("CGPA: " +cgpa[i]);
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
                    System.out.println("Inavlid Choice.");
            }
        }
    }
}