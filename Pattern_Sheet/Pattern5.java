import java.util.Scanner;

class Pattern5
{ int n;
  Scanner scan = new Scanner(System.in);
	Pattern5(){
   n=scan.nextInt();
	}
	public static void main(String[] Deepak)
	{
		Pattern5 p = new Pattern5();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}

	}
}