import java.util.Scanner;
/** 
 * n=5
   1
   121
   1231
   12341
   123451
 */
class Pattern24
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern24()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern24 p = new Pattern24();
		int t=1;
		System.out.println(t);
		for(int i=2;i<=p.n;i++)
		{
			t=1;
			for(int j=1;j<=i+1;j++)
			{
				if(j==i+1)
				{
					t=1;
				}
			 	System.out.print(t++);			 						
			}
			System.out.println();
		}


	}
}