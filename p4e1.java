class p4e1{
	public static void main(String args[]){
		
		
		int ps = Integer.parseInt(args[0]);
		System.out.println("Enter the marks of PS : "+ps);
		int ds = Integer.parseInt(args[1]);	
		System.out.println("Enter the marks of DS : "+ds);
		int df = Integer.parseInt(args[2]);	
		System.out.println("Enter the marks of DF : "+df);
		int d = Integer.parseInt(args[3]);	
		System.out.println("Enter the marks of DBMS : "+d);
		int em = Integer.parseInt(args[4]);	
		System.out.println("Enter the marks of EM : "+em);
		int u = Integer.parseInt(args[5]);
		System.out.println("Enter the marks of UHV : "+u);

		double p = (double)(ps+ds+d+df+u+em)*100/600;	
		System.out.println("Persentage : "+p);
	
	}
}