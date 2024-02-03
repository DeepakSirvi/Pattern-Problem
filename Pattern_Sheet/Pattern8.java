import java.util.Scanner;

class Pattern8
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern8(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern8 p = new Pattern8();
		int i,j;
		for(i=p.n;i>=1;i--)
		{
			for(j=1;j<=p.n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}
}