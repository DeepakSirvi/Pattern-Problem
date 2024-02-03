import java.util.Scanner;

class Pattern60
{
	int n;
    Pattern60(int n)
    {
    	this.n=n;
    }	
    public static void main(String Deepak[])
    {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	Pattern60 p = new Pattern60(n);
    	for(int i=0;i<p.n;i++)
    	{
            int x=1;
    		for(int j=0;j<p.n;j++)
    		{
    			if(i+j<p.n/2 || j-i>p.n/2 || i-j>p.n/2 ||  i+j>p.n+p.n/2-1)
    			{
    				System.out.print(" ");
    			}
    			else 
    			{
    				System.out.print(x);
                    if(j<p.n/2)
                    {
                        x++;
                    }
                    else 
                    {
                        x--;
                    }
    			}
    		}
    		System.out.println("");
    	}
    }
}