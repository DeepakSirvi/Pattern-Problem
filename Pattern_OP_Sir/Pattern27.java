import java.util.Scanner;
/** 
 * table
 */
class Pattern27
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern27()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern27 p = new Pattern27();
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			 	System.out.print(i*j + " ");
			 
			}					
			
			System.out.println();
		}


	}
}