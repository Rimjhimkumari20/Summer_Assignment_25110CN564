import java.util.Scanner;
public class Q2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int choice = 0;

        while(choice!=5){
            System.out.println("--Menu-driven Array Operations--");
            System.out.println("1. ADD Elements");
            System.out.println("2. Select Element");
            System.out.println("3. Update Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit!");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Elements: ");
                    for(int i=1;i<n;i++){
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Element Added.");
                    break;

                case 2:
                    System.out.print("Enter Element to Search: ");
                    int searchEl = sc.nextInt();
                    boolean found = false;

                    for(int i=0;i<n;i++){
                        if(searchEl==arr[i]){
                            found = true;
                            System.out.println("Element find at position " +(i+1));
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Element Not Found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter position to Update: ");
                    int pos = sc.nextInt();

                    if(pos>=1 && pos<=n){
                       System.out.print("Enter New Value to update: ");
                       arr[pos-1] = sc.nextInt();
                       System.out.println("Element Updated.");
                    }else{
                        System.out.println("Invalid Position.");
                    }
                    break;

                case 4:
                    System.out.print("Enter position to delete: ");
                    int p = sc.nextInt();

                    if(p>=1 && p<=n){
                        for(int i= p -1 ;i<n-1;i++){
                            arr[i] = arr[i+1];                    
                        }
                        n--;
                    System.out.println("Element Deleted..");
                    }else{
                        System.out.println("Inavlid Position");
                    }

                    break;

                case 5:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

    }
}
