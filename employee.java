package owlCoder;

import java.util.Scanner;

public class employee {

	int empid;
	String ename,desg,company,address;
	float sal;
	Scanner sc=new Scanner(System.in);
	public void getemp()
	{
	    empid=sc.nextInt();
	    sc.nextLine();
	    ename=sc.nextLine();
	    desg=sc.nextLine();
	    company=sc.nextLine();
	    address=sc.nextLine();
	    sal=sc.nextFloat();
	}
	public void display()
	{
	    System.out.print(empid+" "+ename+" "+desg+" "+company+" "+address+" "+sal+" ");
	}

	public static void main(String args[])
	{
		employee o=new employee();
	    o.getemp();
	    o.display();
	}
}
