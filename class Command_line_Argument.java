class Command_line_Argument{
	public static void main(String args[]){
		double d,a,b;

		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);

		d=a+b;

		System.out.printf("add : %.2f",d);
		
	}
}