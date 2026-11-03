package lab;
class Car
{
	public void fourTyres()
	{
		System.out.println("I have four tyres");
	}
}

class Aura extends Car
{
	public void powerWindows()
	{
		System.out.println("I have Power windows");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Car c=new Car();  // Object creation
		c.fourTyres();
		Aura a=new Aura();
		a.powerWindows();
		System.out.println();
		
		
		System.out.println("Test");
	}
}
