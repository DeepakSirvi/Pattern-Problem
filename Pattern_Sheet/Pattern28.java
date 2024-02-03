import java.util.Scanner;

class Pattern28
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern28(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern28 p = new Pattern28();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}
}