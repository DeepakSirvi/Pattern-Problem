import java.util.Scanner;

class Pattern32
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern32(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern32 p = new Pattern32();
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