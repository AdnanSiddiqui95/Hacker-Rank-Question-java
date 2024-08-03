import java.util.InputMismatchException;
import java.util.Scanner;
public class IntStaticDoubleExcep 
{
	
	public static void main(String[] args) 
	{
	System.out.println("Enter any thing : ");
	Scanner sc=new Scanner(System.in);
	try 
	{
		int i=sc.nextInt();	
		System.out.println("Int Type : "+i);
	}
	catch(InputMismatchException ex)
	{
		System.out.println(ex);
	}
	sc. nextLine();
	try
	{
		double d=sc.nextDouble();
		System.out.println("Double Type : "+d);
	}
	catch(InputMismatchException ex)
	{
		System.out.println(ex);
	}
	sc. nextLine();
	String s=sc.nextLine();
	System.out.println("String Type : "+s);
	}
}

