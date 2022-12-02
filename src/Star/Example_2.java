package Star;



public class Example_2 
{
	//     *
	//    ***
	//   *****
	//  *******
	// *********
	public static void main(String[] args) 
	{
		
		for (int i =1; i <=5; i++) //rows
		{
			for (int j =1; j <=5-i; j++)   //space
			{
				System.out.print(" ");
				
			}
			for (int k =1; k<=i*2-1; k++) //star
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		
		
		}
	}

}
