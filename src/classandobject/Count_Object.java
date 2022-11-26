package classandobject;

public class Count_Object {
	
		
		  int count;
		Count_Object()
		{
				count++;
			}
		public  void count_o()
		{
			System.out.println("Total no of Object created :" + count);
		}
		public static void main(String[] args)
		{
			Count_Object o1 =new Count_Object();
			Count_Object o2 = new Count_Object();
			Count_Object o3 = new Count_Object();

			o1.count_o();
//			count_o();
	

	}
}
