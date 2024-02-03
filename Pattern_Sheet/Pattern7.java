import java.util.Scanner;

class Pattern7
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern7(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern7 p = new Pattern7();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=p.n;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}