import java.util.Scanner;
class Pattern56
{
	int n;
	Pattern56(int n)
	{
		this.n=n;
	}
	public static void main (String Deepak[])
	{
		Scanner scan = new Scanner(System.in);
		Pattern56 p = new Pattern56(scan.nextInt());
		for(int i=1;i<=p.n;i++)
		{ 
			char t=65;
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