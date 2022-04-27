package owlCoder;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc123#$%A5Z+";
		int l=0, u=0, d=0, s=0;
		char ch[] = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
				l++;
			else if(ch[i] >= 'A' && ch[i] <= 'Z')
				u++;
			else if(ch[i] >= 48 && ch[i] <= 57)
				d++;
			else
				s++;
		}
		System.out.println(l);
		System.out.println(u);
		System.out.println(d);
		System.out.println(s);
		
		System.out.println("Using the character methods");
		
		u=0;
		l=0;
		d=0;
		s=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLowerCase(ch[i]))
				l++;
			else if(Character.isUpperCase(ch[i]))
				u++;
			else if(Character.isDigit(ch[i]))
				d = d + (ch[i] - 48);         // can use a '0' in place of 48
			else
				s++;
		}
		System.out.println(l);
		System.out.println(u);
		System.out.println(d);
		System.out.println(s);
	}

}
