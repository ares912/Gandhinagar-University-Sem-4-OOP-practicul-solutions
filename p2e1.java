class p2e1{
	int id,dept;
	String name;
	float sal;
	char g;

	public static void main(String args[])
	{
		p2e1 e1 = new p2e1();
		p2e1 e2 = new p2e1();
		
		e1.id=101;
		e1.name="Soni Kuldeep";
		e1.sal=10000.0f;
		e1.dept=15;
		e1.g='M';

		e2.id=109;
		e2.name="Panchal Raj";
		e2.sal=10052.0f;
		e2.dept=16;
		e2.g='F';

		System.out.println("Employee 1 Details");
		System.out.println("ID: "+e1.id);
		System.out.println("Name: "+e1.name);
		System.out.println("Department: "+e1.dept);
		System.out.println("Gender: "+e1.g);
		System.out.println("Salary: "+e1.sal);

		System.out.println("Employee 2 Details");
		System.out.println("ID: "+e2.id);
		System.out.println("Name: "+e2.name);
		System.out.println("Department: "+e2.dept);
		System.out.println("Gender: "+e2.g);
		System.out.println("Salary: "+e2.sal);



	}
}