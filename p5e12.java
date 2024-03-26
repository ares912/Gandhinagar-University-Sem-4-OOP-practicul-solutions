import java.util.Scanner;
class p5e12{
	public static void main(String args[]){
		Scanner meth = new Scanner(System.in);
		
		System.out.print("Enter The First Number : ");
		int a =meth.nextInt();
		System.out.print("Enter The Second Number : ");
		int b =meth.nextInt();

		
		System.out.println("Sum is : "+(a+b));
		System.out.println("Subraction is : "+(a-b));
		System.out.println("Multiplication is : "+(a*b));
		System.out.println("Divison is : "+(a/b));
		System.out.println("Remainder is : "+(a%b));	 
		System.out.println("Signed Left Shift is : "+(a<<b));
		System.out.println("Signed Right Shift is : "+(a>>b)); 
		System.out.println("Unsigned Right Shift is : "+(a>>>b));



	}
}