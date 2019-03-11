import java.util.Scanner;
public class Employee
{	
	static int employeeId;
	static String employeeName;
	static float monthlyBasic;
	float medicalAllowance = 1250;
	float conveyanceAllowance = 800;
	float hra = (float)(0.5*monthlyBasic);
	static float grossSal; 
	float pf = (float)(0.1*monthlyBasic);
	static float esic;
	static int profTax;
	static float monthlyDeduct;
	static float annualTake;
	static float monthlyTake;

	public float getAnnualBasic() 
	{
		return (12 * monthlyBasic);
		
	}
	public float getMonthlyGrossSalary()
	{
		return (monthlyBasic + hra + medicalAllowance + conveyanceAllowance);
	}
	public float getAnnualGrossSalary() 
	{	
		return (12 * grossSal);
	}
	public float getMonthlyDeductions() 
	{
		if(grossSal<=10000)
		{
			profTax=50;
		}
		else
		{
			profTax=100;
		}
		if(monthlyBasic<=5000)
		{
			esic=(float)(0.0475*monthlyBasic);
		}
		else
		{
			esic=0;
		}
		return (pf + esic + profTax);
	}
	public float getMonthlyTakeHome() 
	{
		return (grossSal- monthlyDeduct);
	}
	public float getAnnualTakeHome()
	{
		return (12 * monthlyTake);
		
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id: ");
		employeeId = sc.nextInt();
		System.out.println("Enter employee name: ");
		employeeName = sc.next();
		System.out.println("Enter the basic salary of an employee: ");
		monthlyBasic = sc.nextFloat();
		Employee obj = new Employee();
		float annualBasic = obj.getAnnualBasic(); 
		System.out.println("The basic salary of an employee is: " + annualBasic);
		grossSal = obj.getMonthlyGrossSalary();
		System.out.println("The Monthly Gross salary of an employee is: " + grossSal);
		float annualGrossSal = obj.getAnnualGrossSalary();
		System.out.println("The Annual Gross salary of an employee is: " + annualGrossSal);
		monthlyDeduct = obj.getMonthlyDeductions();
		System.out.println("The Monthly Deductions of an employee is: " + monthlyDeduct);
		monthlyTake = obj.getMonthlyTakeHome();
		System.out.println("The Monthly take home salay of an employee is: " + monthlyTake);
		annualTake = obj.getAnnualTakeHome();
		System.out.println("The Annual take home salay of an employee is: " + annualTake);
	}
	
}