import java.util.Scanner;
class Pattern52
{
	int n;
	Pattern52(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern52 p = new Pattern52(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			char t=(char)(65+i-1);
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