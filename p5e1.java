import java.util.Scanner;

class p5e1{
	public static void main(String args[]){
		Scanner math = new Scanner(System.in);
		
		System.out.println("Enter the value of A : ");
		double a =math.nextDouble();
		System.out.println("Enter the value of B : ");
		double b =math.nextDouble();
		
		double sum= a+b;
		System.out.println("Sum : "+sum);
		double s= a-b;
		System.out.println("Subtraction : "+s);
		double m= a*b;
		System.out.println("Multiplication : "+m);
		double d= a/b;
		System.out.println("Divison : "+d);
		double mod= a%b;
		System.out.println("Remainder : "+mod);	
	}
}