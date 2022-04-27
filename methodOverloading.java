package owlCoder;

public class methodOverloading {
	public void add(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}
	
	public int add(int num1, int num2, int num3)
	{
		int result = num1 + num2 + num3;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading ob = new methodOverloading();
		ob.add(1, 2);
		int r = ob.add(1, 2, 3);
		System.out.println(r);
	}

}
