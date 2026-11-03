
package Com.java2;

import java.util.Scanner;

import com.java.testCase.HotelData;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter 1 for Exception");
            System.out.println("Enter 2 for Thread");
            System.out.println("Enter 3 for Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    HotelData data = new HotelData();
                    System.out.println(data.storeAllHotels());
                    break;

                case 2:
                    TestThread t = new TestThread();
                    ((Object) t).runThreads();
                    break;

                case 3:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
