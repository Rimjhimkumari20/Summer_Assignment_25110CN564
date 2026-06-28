import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] name = new String[150];
        String[] PhoneNum = new String[150];
        int totalCount = 0;
        int choice = 0;

        while(choice!=6){
            System.out.println("---Contact Management SYSTEM---");
            System.out.println("1. Add New Contact.");
            System.out.println("2. View all Contact.");
            System.out.println("3. Search Contact By Name.");
            System.out.println("4. Update Contact Details.");
            System.out.println("5. Delete Contact.");
            System.out.println("6. Exit!");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name[totalCount] = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    PhoneNum[totalCount] = sc.nextLine();
                    totalCount++;
                    System.out.println("Added Succesfully!");
                    break;

                case 2:
                    if(totalCount==0){
                        System.out.println("No Contacts Available");
                    }else{
                      System.out.println("All Contacts: ");
                      for(int i=0;i<totalCount;i++){
                          System.out.println(name[i]);
                          System.out.println(PhoneNum[i]);
                       }
                    } 
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for(int i=0;i<totalCount;i++){
                        if(searchName.equals(name[i])){
                            System.out.println(name[i]);
                            System.out.println(PhoneNum[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("No Contact Found!");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Enter Name to update: ");
                    String updateName = sc.nextLine();
                    boolean update = false;

                    for(int i=0;i<totalCount;i++){
                        if(name[i].equals(updateName)){
                            System.out.print("Enter new name: ");
                            name[i] = sc.nextLine();
                            System.out.print("Enter new Number: ");
                            PhoneNum[i] = sc.nextLine();
                            System.out.println("Contact Updated Successfully!");
                            update = true;
                            break;
                        }
                    }

                    if(!update){
                        System.out.println("Contact Not Found!");
                    }
                    break;
                    
                case 5:
                    sc.nextLine();
                    System.out.println("Enter Name to Delete: ");
                    String deleteName = sc.nextLine();
                    boolean Found = false;

                    for(int i=0;i<totalCount;i++){
                        if(name[i].equals(deleteName)){
                            for(int j =i;j<totalCount-1;j++){
                                name[j] =name[j+1];
                                PhoneNum[j] = PhoneNum[j+1];
                            }
                            totalCount--;
                            Found = true;
                    System.out.println("Contact delete successfully!");
                     break;
                        }
                    }
                if(!Found){
                    System.out.println("Contact Not Found!.");
                }
                break;

            case 6:
                System.out.println("Exiting Contact Management System..");
                break;

            default:
                System.out.println("Invalid Choice!");

            }
        }
    }
}
