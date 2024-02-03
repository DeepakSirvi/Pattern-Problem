import java.util.Scanner;

class Pattern58
{
	int n;
    Pattern58(int n)
    {
    	this.n=n;
    }	
    public static void main(String Deepak[])
    {import java.util.Scanner;

class Pattern58
{
	int n;
    Pattern58(int n)
    {
    	this.n=n;
    }	
    public static void main(String Deepak[])
    {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	Pattern58 p = new Pattern58(n);
    	for(int i=0;i<p.n;i++)
    	{
    		for(int j=0;j<p.n;j++)
    		{
    			if(i+j<p.n/2 || j-i>p.n/2 || i-j>p.n/2 ||  i+j>p.n+p.n/2-1)
    			{
    				System.out.print(" ");
    			}
    			else 
    			{
    				System.out.print("*");
    			}
    		}
    		System.out.print("\n");
    	}
    }
}
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	Pattern58 p = new Pattern58(n);
    	for(int i=0;i<p.n;i++)
    	{
    		for(int j=0;j<p.n;j++)
    		{
    			if(i+j<p.n/2 || j-i>p.n/2 || i-j>p.n/2 ||  i+j>p.n+p.n/2-1)
    			{
    				System.out.print(" ");
    			}
    			else 
    			{
    				System.out.print("*");
    			}
    		}
    		System.out.print("\n");
    	}
    }
}