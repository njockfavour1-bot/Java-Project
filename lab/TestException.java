package lab;

import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		System.out.println("Enter your number: ");
		int a,b;
		Scanner scanner=new Scanner(System.in);
		try
		{
			a=scanner.nextInt();
			b=scanner.nextInt();
			System.out.println(a/b);
		}
		catch (Exception abc) {
			System.out.println("Please do a proper input :("+abc);
		}
		finally {
			System.out.println("Always executed. :)");
		}
	}

}
