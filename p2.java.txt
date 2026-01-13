/**Write a Java program to solve a system of two linear equations with two variables (e.g., ax +
by = e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate and
display the values of x and y using Cramer's rule. Include error handling for cases where the
denominator is zero. Cramer's rule: D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D */

import java.util.Scanner;

class P2
{
	public static void main(String args[])
	{
		System.out.println(" two linear equations with two variables ");
		Scanner sc= new Scanner(System.in);
		double a,b,c,d,e,f;
		System.out.println("Enter value of a");
		a=sc.nextDouble();
		
		System.out.println("Enter value of b");
		b=sc.nextDouble();
		System.out.println("Enter value of c");
		c=sc.nextDouble();
		System.out.println("Enter value of d");
		d=sc.nextDouble();
		System.out.println("Enter value of e");
		e=sc.nextDouble();
		System.out.println("Enter value of f");
		f=sc.nextDouble();
		//D=ad−bc
		double D= (a*d)- (b*c);
		//Dx=ed−bf
		double Dx=(e*d)-(b*f);
		//Dy=af−ce
		double Dy=(a*f)-(c*e);
		
		if(D==0)
		{
			System.out.println("Not Possible");
		}
		else
		{
			//x=Dx/D, y=Dy/D
			double x=Dx/D;
				double y=Dy/D;
		
		//System.out.println(x);
		//System.out.println(y);
		System.out.printf("\n%.2f \t %.2f",x,y);
		}
	

		
	}
}