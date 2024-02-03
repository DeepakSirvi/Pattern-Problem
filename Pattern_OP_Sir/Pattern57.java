import java.util.Scanner;
class Pattern57
{
	int n;
	Pattern57(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern57 p = new Pattern57(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			char t=65;
			for(int j=1;j<=(p.n)+i-1;j++)
			{
		       	if(j<p.n-i+1)
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