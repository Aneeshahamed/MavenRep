package stringSplit;

public class Split {

	public static void main(String[] args) 
	{
		String Model = "Data 1 |test" ;
		String[] Model_Name_dummy = Model.split("\\|",2);
		
		System.out.println(Model_Name_dummy[0]);
		

	}

}
