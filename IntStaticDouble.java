import java.util.Scanner;
public class IntStaticDouble 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter any thing you want to:");
	Scanner sc=new Scanner(System.in);
	
	int i=sc.nextInt();	
	sc. nextLine();
	double d=sc.nextDouble();
	sc. nextLine();
	String s=sc.nextLine();
	
	System.out.println("Int Type : "+i);
	System.out.println("Double Type : "+d);
	System.out.println("String Type : "+s);
	}
}
