import java.util.Scanner;

class Pattern2
{ int n;
  Scanner scan = new Scanner(System.in);
	Pattern2(){
   n=scan.nextInt();
	}
	public static void main(String[] Deepak)
	{
		Pattern2 p = new Pattern2();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=p.n-i+1;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}
}