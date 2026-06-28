import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[150];
        String[] bookName = new String[150];
        boolean[] issued = new boolean[150];

        int choice = 0;
        int count = 0;

        while(choice!=6){
            System.out.println("---Library Management System----");
            System.out.println("1. ADD Book");
            System.out.println("2. Issue book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Total Books");
            System.out.println("5. Seach Book");
            System.out.println("6. EXIT!");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();
                    count++;
                    System.out.println("Book Added Succesfully!");
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    boolean found = false;

                    for(int i=0;i<count;i++){
                        if(bookId[i]==issueId){
                            found = true;
                            if(!issued[i]){
                                issued[i] = true;
                                System.out.println("Book issued Successfully!");
                            }else{
                                System.out.println("Book is already Issued.");
                            }
                            break;
                        }
                    }
                   if(!found){
                      System.out.println("Book Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Id to return: ");
                    int returnId = sc.nextInt();
                    found = false;

                    for(int i=0;i<count;i++){
                        if(bookId[i]==returnId){
                            found = true;
                            if(issued[i]){
                                issued[i] = false;
                                System.out.println("Book returned successfully!");
                            }else{
                                System.out.println("Book was not issued");
                            }
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Total Books: "+count);
                    for(int i=0;i<count;i++){
                        System.out.println("Book ID: " +bookId[i]);
                        System.out.println("Book Name: " +bookName[i]);
                        System.out.println("Status: " +(issued[i] ? "Issued" : "Available"));
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();
                    found = false;

                    for(int i=0;i<count;i++){
                        if(bookId[i]==searchId){
                            System.out.println("Book Found!");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}