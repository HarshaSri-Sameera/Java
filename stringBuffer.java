package owlCoder;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Sun rises in the ");
		String str = new String("this is what i am this is who i am this is why I built for");
		
		int l = s.length();
		System.out.println(l);
		
		s = s.concat("East");
		System.out.println(s);
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String words[] = s.split(" ");
		for(String st: words)
		{
			System.out.println(st);
		}
		
		String s3 = new String("APPLE");
		String s4 = new String("apple");
		System.out.println(s3.equals(s4)); // false
		System.out.println(s3.equalsIgnoreCase(s4)); // true
		
		// replace
		System.out.println(s.replace('i', 'x'));
		System.out.println(s.replace("Sun", "Moon"));
		System.out.println(str.replace("this", "and"));
	
		//count of a character
		String s5 = "malayalam";
		System.out.println(s5.length() - s5.replace("m", " ").length());
		
		for(int i=0;i<s5.length();i++)
			System.out.println(s5.charAt(i));
		
		// index
		System.out.println(s5.indexOf('m'));
		System.out.println(s5.lastIndexOf('m'));
		
		// substrings
		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 7));
				
		// to char array - to generate given string into character array
		char x[] = s5.toCharArray();
		for(char it: x)
			System.out.print(it + " ");
		
		// char array to string back
		String s6 = new String(x);
		System.out.println();
		System.out.println(s6);
		
		String s1 = "Taj";
		String s2 = " Mahal";
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		String s7 = new String("Rose");
		s7 = s7.concat("Milk");
		System.out.println(s7);
		StringBuffer s8 = new StringBuffer("Rose");
		s8.append("Milk");
		System.out.println(s8);
	}

}
