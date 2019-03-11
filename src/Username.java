import java.util.Scanner;

public class Username 
{
	public static void main(String[] args) 
	{
		int n = 0;
		String username;
		String password;
		Scanner sc = new Scanner(System.in);
		
		while(n<3)
		{
			System.out.println("Enter Username: ");
			username = sc.next();
			System.out.println("Enter Password: ");
			password = sc.next();
			if(username.equals("Admin") && password.equals("Admin"))
			{
				System.out.println("Welcome" +" "+ username);
				break;
			}
			n++;
			if(n==3)
			{
				System.out.println("contact Admin");
				
			}
		}
		
		sc.close();
	}
}
