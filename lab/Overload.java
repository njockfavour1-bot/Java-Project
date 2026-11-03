package lab;
class Overload2
{ int x=32;
	public void User() {
		System.out.println("Hi from User");
	}
	public void call()  {
		System.out.println("Hi from call variable");
	}
	public Overload2() {
		System.out.println("This is constrcutor");
		
	}
	
	
}
public class Overload {

public static void main(String[] args) {
	Overload2 favour = null;
	favour=new Overload2();
	System.out.println(favour.x);
	favour.User();
	favour.call();
}
}
