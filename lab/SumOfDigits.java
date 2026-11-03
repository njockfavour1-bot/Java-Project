package lab;
import java.util.Scanner;

class Test
{
	public int calculateSoD(int num)
	{
	 if(num<0)
	{
		SumOfDigits.main(null);
	}
	else {
		for(;num>0;);
	}
		int sum=0;
		for(;num>0;)
		{
			
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		
		}
		
		
		return sum;
	}
}
public class SumOfDigits {
	public static void main(String[] args) {
		Test test=new Test();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int a=scanner.nextInt();
		System.out.println(test.calculateSoD(a));
		
	}

}
