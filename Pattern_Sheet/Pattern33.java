import java.util.Scanner;

class Pattern33
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern33(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern33 p = new Pattern33();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}