/**Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787),
Calculate and display the minimum number of currency notes of denominations 100, 50, 10,
5, 2, and 1 that would be given to the user.*/


import java.util.Scanner;
public class p5{
	public static void main(String args[]){
		
		int amount,d;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Amount:");
		amount=sc.nextInt();

		d=amount/100;
		amount%=100;

		System.out.println("Number of 100 notes:"+d);

		d=amount/50;
		amount%=50;

		System.out.println("Number of 50 notes:"+d);

		d=amount/10;
		amount%=10;

		System.out.println("Number of 10 notes:"+d);
		
		d=amount/5;
		amount%=5;

		System.out.println("Number of 5 notes:"+d);

		d=amount/2;
		amount%=2;

		System.out.println("Number of 2 notes:"+d);

		d=amount/1;

		System.out.println("Number of 1 notes:"+d);


		sc.close();
		
	}

}
