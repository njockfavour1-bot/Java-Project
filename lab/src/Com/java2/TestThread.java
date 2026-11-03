package Com.java2;
class Person1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 0; i < 10; i++)
			{
				Thread.sleep(500);
				System.out.println("Running P1");
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Stopped 1" +e);
		}
	}
}
class Person2 extends Thread
{
	public void run()
	{
		try
		{
			for( int i = 0; i < 10; i++) {
			Thread.sleep(500);
			System.out.println("Running P2");
		}
	}
	catch(Exception e)
	{
		System.out.println("Stopped 2");
	}
}
}

public class TestThread {
	

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		p1.start();
		p2.start();
				
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
