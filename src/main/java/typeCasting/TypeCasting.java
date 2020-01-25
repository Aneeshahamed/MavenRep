package typeCasting;

public class TypeCasting {

	public static void main(String[] args)
	{
				//From String to Integer
				String Prow = "30";
				String Pcolumn = "32";
				int Prow1 = Integer.parseInt(Prow);
				int Pcolumn1 = Integer.parseInt(Pcolumn);
				int c = Prow1+Pcolumn1;
				System.out.println("the value c is "+c);
				
				int a = 1234; 
			    int b = 1234; 
			    String str1 = Integer.toString(a+b); 
			    String str2 = Integer.toString(b);
				System.out.println(str1);
	}

}
