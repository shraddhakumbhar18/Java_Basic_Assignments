import java.util.Scanner;

public class StudendMarks 
{
	public static void main(String[] args) 
	{
		int studarr[][] = new int[50][50];
		int student1;
		int maths;
		int science;
		int english;
		int student2;
		int student3;
		int i,j;
		int total;
		int average;
		Scanner sc = new Scanner(System.in);
		for(i=0 ; i<3 ; i++ )
		{
			System.out.println("enter the marks of student:" + (i+1));
			for(j=0 ; j<3 ; j++)
			{
				studarr[i][j] = sc.nextInt();
				
			}
			
		}
		System.out.println("The marks of students:");
		System.out.println("Maths" + "English" + "Science");
		for(i=0 ; i<3 ; i++ )
		{
			for(j=0 ; j<3 ; j++)
			{
				System.out.print(studarr[i][j] + " " + " " + " ");
				
			}
			System.out.println("");
		}
		
		for(i=0 ; i<3 ; i++ )
		{
			int totalScore = 0;
			int avg = 0;
			for(j=0 ; j<3 ; j++)
			{
				totalScore = studarr[i][j] + totalScore;
				
				
			}
			System.out.print("the Total Score of student" + (i+1) + " "+ totalScore);
			avg = totalScore/3;
			System.out.println("");
			System.out.println("the Average Score of student" + (i+1) + " " + avg);
			System.out.println("");
		}
		
		for(i=0 ; i<3 ; i++ )
		{
			int subjectScore = 0;
			int subjectavg = 0;
			for(j=0 ; j<3 ; j++)
			{
				subjectScore = studarr[j][i] + subjectScore;
				subjectavg = subjectScore/3;
				
			}
			if(i==0)
			{
				System.out.println("The Subject total Score of Maths" +" " + subjectScore);
				System.out.println("The subject avg Score of Maths" +" " + subjectavg);
				System.out.println("");
			}
			else if(i==1)
			{
				System.out.println("The Subject total Score of English" +" "+ subjectScore);
			
				System.out.println("The subject avg Score of English" +" " + subjectavg);
				System.out.println("");
			}
			else if(i==2)
			{
				System.out.println("The Subject total Score is of science" + " " + subjectScore);
				System.out.println("");
				System.out.println("The subject avg Score is of Science" +" " + subjectavg);
				System.out.println("");
			}
			
		}
		sc.close();
	}
}
