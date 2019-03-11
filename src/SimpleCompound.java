import java.util.Scanner;

public class SimpleCompound 
{
	public static void main(String[] args) 
	{
		int simpleInterest;
		double compoundInterest;
		int principle;
		double rate = 0;
		
		int period;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle: ");
		principle = sc.nextInt();
		System.out.println("Enter rate: ");
		rate = sc.nextDouble();
		System.out.println("Enter period: ");
		period = sc.nextInt();
		simpleInterest = (int) ((principle*rate*period)/100);
		compoundInterest =  principle *( Math.pow((1+rate/100), period)) ;
		System.out.println("The Simple Interest is " +simpleInterest );
		System.out.println("The Compound Interest is " +compoundInterest );
		sc.close();
	}
}
