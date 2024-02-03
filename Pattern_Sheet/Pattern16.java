import java.util.Scanner;

class Pattern16
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern16(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
	
		Pattern16 p = new Pattern16();
		int i,j;
		for(i=1;i<=p.n;i++)
		{ 
			for(j=1;j<=p.n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}