import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] productId = new int[100];
        String[] productName = new String[100];
        int[] quantity = new int[100];

        int count = 0;
        int choice = 0;

        while(choice!=6)
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    productId[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    productName[count] = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();
                    count++;
                    System.out.println("Product Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Inventory is Empty.");
                    } else {
                        System.out.println("\nID\tName\tQuantity");
                        for (int i = 0; i < count; i++) {
                            System.out.println(productId[i] + "\t" +
                                               productName[i] + "\t" +
                                               quantity[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == searchId) {
                            System.out.println("Product Found:");
                            System.out.println("ID: " + productId[i]);
                            System.out.println("Name: " + productName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update Quantity: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == updateId) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == deleteId) {
                            for (int j = i; j < count - 1; j++) {
                                productId[j] = productId[j + 1];
                                productName[j] = productName[j + 1];
                                quantity[j] = quantity[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Product Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

