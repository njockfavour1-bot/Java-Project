package lab;
import java.util.Scanner;

public class RoomBookingSystem {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[] rooms = {"Room 101", "Room 102", "Room 103", "Room 104"};
	        boolean[] booked = {false, false, false, false};
	        int[] price = {1200, 8000, 9000, 10000};
	        
	        int choice;
	        do {
	        	System.out.println("\n******ROOM BOOKING SYSTEM******\n");
	        	System.out.println("1. View Rooms");
	        	System.out.println("2. View Price");
	        	System.out.println("3. Book Rooms");
	        	System.out.println("4. View Status");
	        	System.out.println("5. Exit");
	        	choice = sc.nextInt();
	        	
	        		switch(choice) {
	        		case 1:
	        			System.out.println("\nAvailable Rooms");
	        			for(int i = 0; i< rooms.length; i++) {
	        				if(!booked[i],)
	        			}
	        		
	        		}
	        			
	        }
	        

}
