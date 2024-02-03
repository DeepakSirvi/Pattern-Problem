import java.util.Scanner;

class Pattern6
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern6(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern6 p = new Pattern6();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=p.n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}