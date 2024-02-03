import java.util.Scanner;

class Pattern14
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern14(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
	
		Pattern14 p = new Pattern14();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ 
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}