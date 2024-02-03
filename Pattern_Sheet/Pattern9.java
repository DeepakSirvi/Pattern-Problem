import java.util.Scanner;

class Pattern9
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern9(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern9 p = new Pattern9();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=p.n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}
}