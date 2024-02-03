import java.util.Scanner;

class Pattern12
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern12(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		Pattern12 p = new Pattern12();
		int i,j;
		for(i=1;i<=p.n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}