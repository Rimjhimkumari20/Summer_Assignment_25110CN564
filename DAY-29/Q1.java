import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        double num1,num2;

        while(choice!=5){
            System.out.println("\n--Calculator Menu--");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. EXIT!");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Addition : " +(num1+num2));
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Subtraction: " +(num1-num2));
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Multiplicaton: " +(num1*num2));
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();
                    if(num2!=0){
                        System.out.println("Division: " +(num1/num2));
                    }else{
                        System.out.println("Division by Zero is not allowed.");
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting Calculator..");
                    break;

                default:
                    System.out.println("Inavlid Choice!");
            }

        }
    }
}