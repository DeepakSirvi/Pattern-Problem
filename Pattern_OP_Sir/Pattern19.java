import java.util.Scanner;
/** 
  n= 5
  1
  01
  010
  1010
  10101
 */
class Pattern19
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern19()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern19 p = new Pattern19();
		int t=1;
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(t++%2==0)
				{
					System.out.print("0");					
				}
				else
				{

					System.out.print("1");
				}
			}
			System.out.println();
		}


	}
}