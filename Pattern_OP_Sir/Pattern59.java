import java.util.Scanner;

class Pattern59
{
	int n;
    Pattern59(int n)
    {
    	this.n=n;
    }	
    public static void main(String Deepak[])
    {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	Pattern59 p = new Pattern59(n);
        int t=1;
    	for(int i=0;i<p.n;i++)
    	{
            int x=t;
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
                        x--;
                    }
                    else 
                    {
                        x++;
                    }
    			}
    		}
            if(i<p.n/2)
            {
                t++;
            }
            else 
            {
                t--;
            }
    		System.out.println("");
    	}
    }
}