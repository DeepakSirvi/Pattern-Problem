import java.util.Scanner;
/** 
 * n=4
        1
      4 9 16 
    25 49 64 81 100 
  121 144 169 196 225 256 

 */
class Pattern31
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern31()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern31 p = new Pattern31();
		int x=1;
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n+i-1;j++)
			{
				if(j>p.n-i)
				{
					System.out.print(x*x + " ");	
					x++;				
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}
}