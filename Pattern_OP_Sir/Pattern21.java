import java.util.Scanner;
/** 
 * n=5
   1
   AB
   234
   CDEF
   56789
 */
class Pattern21
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern21()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern21 p = new Pattern21();
		int t=1;
		char ch=65;
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
			 	 System.out.print(ch++);
			 	}
			 	else
			 	{
			 		System.out.print(t++);
			 	}					
			}
			System.out.println();
		}


	}
}