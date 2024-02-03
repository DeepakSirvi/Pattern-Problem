import java.util.Scanner;
/** Pascal Trinangle
 */
class Pattern6{
	int n;
   int arr[][];
	Scanner scan = new Scanner(System.in); 
   Pattern6(){
   	n = scan.nextInt();
     arr = new int[n][n+1];
   }

   public static void main (String Deepak[]){
   Pattern6 p = new Pattern6();
   p.arr[0][1]=1;
   System.out.println(p.arr[0][1]);
   for(int i=1;i<p.n;i++){
   	for(int j=1;j<=i+1;j++){
      p.arr[i][j]=p.arr[i-1][j-1]+p.arr[i-1][j];
      if(p.arr[i][j]!=0)
      System.out.print(p.arr[i][j]+ " ");
   	}
   	System.out.println();
   }
   }

 
}