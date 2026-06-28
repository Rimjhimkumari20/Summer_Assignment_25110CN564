import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        int choice = 0;

        while(choice!=4){
            System.out.println("---BANK ACCOUNT SYSTEM---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT.");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance+= deposit;
                    System.out.println(deposit+ " Deposited Succesfully!.");
                    break;

                case 2:
                    System.out.print("Enter Amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if(withdraw<=balance){
                        balance-= withdraw;
                        System.out.println("Withdraw Succesfully!");
                    }else{
                        System.out.println("Insufficient Balance!");
                    }
                    break;
                
                case 3:
                    System.out.print("Your Current Balance: " +balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank Account System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again...");
            }
        }
    }
}