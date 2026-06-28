import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalTickets = 50;
        int choice = 0;

        while(choice!=4){
            System.out.println("---TICKET BOOKING SYSTEM---");
            System.out.println("1. Check Available Tickets");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. EXIT.");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Available Ticekets: " +totalTickets);
                    break;

                case 2:
                    System.out.print("Enter Number of tickets to book: ");
                    int bookTicket = sc.nextInt();
                    if(bookTicket<=totalTickets){
                        totalTickets-= bookTicket;
                    System.out.println(bookTicket+ " Ticket(s) Booked Successfully!.");
                    }else{
                        System.out.println("Sorry! Only " +totalTickets+ "is Available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Number of Tickets to Cancel: ");
                    int cancelTickets = sc.nextInt();
                    totalTickets+= cancelTickets;
                    System.out.println(cancelTickets+ " ticket(s) cancelled Successfully.");
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice! Please Try Again...");
            }
        }
    }
}