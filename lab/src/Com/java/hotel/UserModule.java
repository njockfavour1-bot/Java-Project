package Com.java.hotel;



import java.util.List;
import java.util.Scanner;

public class UserModule {

	public static void userBill()
	{
		List<Hotel> listnew= HotelData.displayAllHotel();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter hotel Name");
		String name=scanner.next();
		System.out.println("For how many days ?");
		int days=scanner.nextInt();
		float bill=0.0f;
		for(Hotel y:listnew)
		{
			if(name.equals(y.getName()))
			{
				bill=days*y.getPrice();
			}
		}
		System.out.println("Final bill="+bill);
		System.out.println("ENter Y to accpet");
		String choice=scanner.next();
		if(choice.equals("Y"))
		{
			System.exit(1);
		}
		else
		{
			UserModule.userBill();
		}
	}
}