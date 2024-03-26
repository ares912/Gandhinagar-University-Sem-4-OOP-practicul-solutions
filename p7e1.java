import java.util.Scanner;

class p7e1{
	static void pelindrom(String str){
		String revstr="";
		for(int i=str.length()-1; i>=0;i--){
			revstr=revstr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revstr)){
			System.out.println("It is Pelindrom");			
		}
		else{
			System.out.println("It is Not a Pelindrom");			
		}
	}

	static void pelindrom(int num){
		
		int temp=num,revnum=0;

		while(temp<0){
			int r= temp%10;
			revnum=revnum*10+r;
			temp=temp/10;
		}
		if(num==revnum)
			System.out.println("It is Pelindrom");
		else
			System.out.println("It is not a Pelindrome");	
	}

	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The String : ");
		String s =sc.nextLine();
		p7e1.pelindrom(s);

		System.out.print("Enter The Number : ");
		int n=sc.nextInt();
		p7e1.pelindrom(n);

	}
}