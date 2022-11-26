
public class examlpe3 {



	public static void main(String[] args) {
		//1.By using class name
		examlpe3.test();
        // 2.By creating object
		examlpe3 example_3 = new examlpe3();
		example_3.test();
		//3.Directly by using method name
		 test();
	}
	
	public static void test()
	{
		System.out.println("this is test method");
	}

}

