package p1;
import java.util.Scanner; 
class p6e1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the text : ");
		String a = s.nextLine();
		System.out.println("");
		System.out.println("String Length is : "+a.length());
		System.out.println("");
		System.out.println("The Second half of the String Is :"+a.substring(a.length()/2));			
	}
}