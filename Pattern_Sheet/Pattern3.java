import java.util.Scanner;

class Pattern3
{ int n;
  Scanner scan = new Scanner(System.in);
	Pattern3(){
   n=scan.nextInt();
	}
	public static void main(String[] Deepak)
	{
		Pattern3 p = new Pattern3();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=p.n-i+1;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}

	}
}