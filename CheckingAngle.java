import java.util.Scanner;


public class CheckingAngle{
	public static void main(String args[])
 {
	int angle1=0, angle2=0, angle3=0;
	Scanner input =new Scanner(System.in);
	System.out.println("enter the angle 1 ");
	angle1=input.nextInt();
	System.out.println("enter the angle 2");
	angle2=input.nextInt();
	System.out.println("enter the angle 3 ");
	angle3=input.nextInt();
	int sum = angle1+angle2+angle3;
	System.out.println("the sum of three angles are "+sum);
	if(sum==90)
	{
		System.out.println("Sum show that it is Right Angle Triangle ");
	}
	else if(sum>90 && sum<=120)
	{
		System.out.println("Sum show that it is Obtuse Angle Triangle ");
	}
	else if(sum>=0 && sum<90)
	{
		System.out.println("Sum show that it is Actue Angle Triangle ");
	}
	else
	{
	 System.out.println("Sorry!!!! No Right angle trianlge Neither Actue Angle Triangle Nor Obtuse angle trianlge ");
	}
 }
}