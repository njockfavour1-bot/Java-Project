package lab;

import java.util.Scanner;

//Implement your logic
interface Gmail
{
	public void name();
	public void password();
	public void zipCode();
}
interface intel
{
	abstract int Workerid();
	void Workername();

}

abstract class Usermail implements Gmail, intel
{
	static Scanner scanner=new Scanner(System.in);

	@Override
	public void Workername() {
		System.out.println("Enter Name: ");
		String n=scanner.next();
		System.out.println(n);
	}
	@Override 
	public void password() {
		// TODO Auto-generated method stub
	}
	@Override
	public void zipCode() {
		
	}
	
}





public class TestInterface {

}
