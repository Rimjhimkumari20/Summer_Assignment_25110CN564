import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float balance = 1000000;
        int choice=0;

        while(choice!=4){
        System.out.println("ATM STIMULATION MENU:");
        System.out.println("1. Check Balance.");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter Your Choice: ");
        choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Current Balance: Rs." +balance);
                    break;
                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    double deposit = sc.nextDouble();
                    balance+= deposit;
                    System.out.println("Amount Deposit Succesfully.");
                    break;
                case 3:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdraw = sc.nextDouble();
                    if(withdraw<=balance){
                        balance-= withdraw;
                        System.out.println("Please Collect Your cash.");
                    }else{
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }

    }
}