import java.util.Scanner;
/** 
 * n=5
   1
   *2
   1*3
   *2*4
   *1*3*5
 */
class Pattern20
{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern20()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern20 p = new Pattern20();
		int t;
		for(int i=1;i<=p.n;i++)
		{
			t=1;
			for(int j=1;j<=i;j++)
			{
			 	if(i%2==0)
			 	{
			 		if(j%2==0)
			 		{
			 			System.out.print(t++);
			 		}
			 		else
			 		{
			 			System.out.print("*");
			 			t++;
			 		}
			 	}	
			 		else
			 		{
			 			if(j%2==0)
			 			{
			 			System.out.print("*");
			 			t++;
			 			}
			 			else
			 			{
			 			System.out.print(t);
			 			t++;
			 			}
			 		}					
			}
			System.out.println();
		}


	}
}