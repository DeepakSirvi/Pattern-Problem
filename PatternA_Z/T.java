import java.util.Scanner;
class T
{
	int n;
	Scanner scan = new Scanner(System.in);	
	T()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		T p = new T();
		if(p.n%2==0)
		{
			p.n--;
		}
		for(int i=1;i<=p.n;i++)
		{
			for(int j=1;j<=p.n;j++)
			{
				if(i==1 || j==(p.n/2+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	

			}
			System.out.println();
		}
	}
}		