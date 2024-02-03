import java.util.Scanner;
class Pattern29
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern29()
	{
		n = scan.nextInt();
	}
	public static void main(String [] Deepak)
	{
		Pattern29 p = new Pattern29();
		int i,j;
		int x = p.n*2-1;
		for(i=1;i<=p.n*2-1;i++)
		{
			for(j=1;j<=x;j++)
			{
				if()
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<p.n)
				{
					x-=1;
				}
				else
				{
					x+=1;
				}
			System.out.println();
		}
	}
}