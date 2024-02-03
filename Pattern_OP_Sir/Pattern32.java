import java.util.Scanner;
/** 
 * n=5
   1
   123
   12345
   1234567
   123456789
 */
class Pattern32
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern32()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern32 p = new Pattern32();
		int t=1;
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=i*2-1;j++)
			{
			 	System.out.print(j +" ");	
			}					
			
			System.out.println();
		}


	}
}