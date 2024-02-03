import java.util.Scanner;

class Pattern37{
  Scanner scan = new Scanner(System.in);
	int n;
	Pattern37(){
     n = scan.nextInt();
	}

	public static void main(String Deepak[]){
		int i,j,x=1;
		Pattern37 p =new Pattern37();

		for(i=1;i<=p.n*2-1;i++){
			char t=65;
			for(j=1;j<=x*2-1;j++){
				System.out.print(j<x?t++:t--);
			}
			if(i<p.n)
			{
				x++;
			}
			else{
				x--;
			}
      System.out.println();
		}
	}
}