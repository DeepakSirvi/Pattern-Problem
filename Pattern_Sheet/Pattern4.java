import java.util.Scanner;

class Pattern4
{ int n;
  Scanner scan = new Scanner(System.in);
	Pattern4(){
   n=scan.nextInt();
	}
	public static void main(String[] Deepak)
	{
		Pattern4 p = new Pattern4();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}
}