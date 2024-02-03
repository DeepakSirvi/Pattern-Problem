import java.util.Scanner;
class DiamondPattsern{

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int x=n,y=1;
		System.out.println(n);

		for(int i=0;i<n;i++,x++)
		{
			for(int j=1;j<=x;j++)
			{
                 if(j<n-i)
                 {
                 	System.out.print(" ");
                 }
                 else{
                 	System.out.print("*");
                 }
			}
			System.out.println();
		}
	}
	
}