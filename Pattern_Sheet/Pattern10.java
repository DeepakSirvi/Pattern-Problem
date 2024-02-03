import java.util.Scanner;

class Pattern10
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern10(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern10 p = new Pattern10();
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