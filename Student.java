import java.util.Scanner;

public class Student {
	
	public static void main(String args[])
	{
		String rollno, name;
		int marks;
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextLine();
		marks = sc.nextInt();
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("rollnumber: " + rollno);
		System.out.println("name: " + name);
		System.out.println("marks: " + marks);
		sc.close();
	}
}
