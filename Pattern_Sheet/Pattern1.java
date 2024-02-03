import java.util.Scanner;

class Pattern1
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern1(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern1 p = new Pattern1();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=p.n;j++)
			{
				System.out.print("@");
			}
			System.out.println();
		}

	}
}