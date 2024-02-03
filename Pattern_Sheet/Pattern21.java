import java.util.Scanner;
class Pattern21{
    Scanner scan = new Scanner(System.in);
    // int n;
    // int a[][];
    // Pattern21(){
    // 	n=scan.nextInt();
    // 	 a[][] = new int[n][(n+2)];
    // }

    public static void main(String Deepak[]){
    	Pattern21 p = new Pattern21();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    	int a[][]=new int[n][n+1];
    	a[0][1]=1;
    	System.out.println(a[0][1]);
    	for(int i=1;i<n;i++){

    		for(int j=1;j<=i+1;j++){
    			System.out.print((a[i][j]=(a[i-1][j-1]+a[i-1][j]))+" ");
    		}
    		System.out.println();
    	}
    }

}