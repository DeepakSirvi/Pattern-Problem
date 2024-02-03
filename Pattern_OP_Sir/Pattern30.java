import java.util.Scanner;
/** n=3
 @
 #
 @@
 ##
 @@@
 ###
 */

class Pattern30
{
	Scanner scan = new Scanner(System.in);
	int n,count;
	Pattern30()
	{
       n = scan.nextInt();
	}

	public static void main(String[] Deepak)
	{
		Pattern30 p = new Pattern30();
		for(int i=1;i<=p.n;)
		{ 
			p.count++;
			for(int j=1;j<=i;j++)
			{
				if(p.count==1)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("@");
				}

			}
			if(p.count==2)
			   {
					i++;
					p.count=0;
			   }
			   System.out.println();
			
		}
	}

}