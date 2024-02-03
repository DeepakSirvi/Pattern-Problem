import java.util.Scanner;
class Pattern44{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern44(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern44 p=new Pattern44();
		for(int i=1;i<=p.n;i++)
		{
			int t=1;
			for(int j=1;j<=p.n*2;j++)
			{ 
		      
			 if(t>(p.n-i+1))
				{ 
					System.out.print(" ");
					t--;

				}
			    else
			    {
				  	System.out.print(j>=p.n?t--:t++);
			
				 	if(j==p.n)
					{
						t++;
					}  
				} 	
			}
			System.out.println();
		}
	}
}