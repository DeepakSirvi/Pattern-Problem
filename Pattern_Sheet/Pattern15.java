import java.util.Scanner;

class Pattern15
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern15(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
		
		Pattern15 p = new Pattern15();
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