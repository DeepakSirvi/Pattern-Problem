import java.util.Scanner;
class Pattern46{
	Scanner scan = new Scanner(System.in);
	int n;
	Pattern46(){
		n=scan.nextInt();
	}

	public static void main(String Deepak[]){
		
		Pattern46 p=new Pattern46();
		for(int i=1;i<=p.n;i++){
			int t=1;
			for(int j=1;j<=(p.n-i+1)*2;j++){
				System.out.print(j>=p.n-i+1?t--:t++);
			
				if(j==p.n-i+1){
					t++;
				}  
					
			}
			System.out.println();
		}
	}
}