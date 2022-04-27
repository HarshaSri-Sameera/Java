package owlCoder;

import java.util.Scanner;
public class stringReverse {

	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		String w[]=s.split(" ");
		for(int i=0;i<w.length;i++)
		{
			StringBuffer sb=new StringBuffer(w[i]);
			System.out.print(sb.reverse()+" ");
		}
		sc.close();
		
	}

}
