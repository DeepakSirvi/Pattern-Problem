import java.util.Scanner;
class Pattern53
{
	int n;
	Pattern53(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern53 p = new Pattern53(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			int t=i;
			for(int j=1;j<=(p.n*2)-i;j++)
			{
		       	if(j<i)
		       	{
		       		System.out.print(" ");
		       	}
		       	else 
		       	{
		       		System.out.print(t);
		       
		       	if(j<p.n)
		       	{
		       		t++;
		       	}
		       	else 
		       	{
		       		t--;
		       	}
		       }
			}	
			System.out.println();

		}

	}
}