package lab;
	

import java.util.Scanner;

public class RoomBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] rooms = {"Room 101", "Room 102", "Room 103", "Room 104"};
        boolean[] booked = {false, false, false, false};

        int choice;

        do {
            System.out.println("\n===== ROOM BOOKING SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. View Booking Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Rooms:");
                    for (int i = 0; i < rooms.length; i++) {
                        if (!booked[i]) {
                            System.out.println((i + 1) + ". " + rooms[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nSelect a Room:");
                    for (int i = 0; i < rooms.length; i++) {
                        System.out.println((i + 1) + ". " + rooms[i]);
                    }

                    System.out.print("Enter room number: ");
                    int room = sc.nextInt();

                    if (room >= 1 && room <= rooms.length) {
                        if (!booked[room - 1]) {
                            booked[room - 1] = true;
                            System.out.println(rooms[room - 1] + " booked successfully!");
                        } else {
                            System.out.println("Sorry, this room is already booked.");
                        }
                    } else {
                        System.out.println("Invalid room number.");
                    }
                    break;

                case 3:
                    System.out.println("\nRoom Booking Status:");
                    for (int i = 0; i < rooms.length; i++) {
                        if (booked[i]) {
                            System.out.println(rooms[i] + " - Booked");
                        } else {
                            System.out.println(rooms[i] + " - Available");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Room Booking System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}