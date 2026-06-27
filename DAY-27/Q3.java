import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20; //20% HRA
        double da = basicSalary * 0.10; //10% DA

        double netSalary = basicSalary+hra+da;

        System.out.println("----Salary Details------");
        System.out.println("Employee Name: " +name);
        System.out.println("Employee ID: " +id);
        System.out.println("Basic Salary: " +basicSalary);
        System.out.println("HRA(20%) :" +hra);
        System.out.println("DA(10%) :" +da);
        System.out.println("Net Salary :" +netSalary);
    }
}
