import java.util.Scanner;

class Pattern22
{ Scanner scan = new Scanner(System.in);
  int n;
	Pattern22(){
	 n=scan.nextInt();	
	}
	public static void main(String[] Deepak)
	{
	
		Pattern22 p = new Pattern22();
		int i,j;
		char ch=65;
		for(i=1;i<=p.n;i++)
		{ 
			for(j=i;j>=1;j--)
			{
				
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}

	}
}