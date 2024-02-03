import java.util.Scanner;
/** n=5
 11111
 10001
 10001 
 10001
 11111
 */
class Pattern10{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern10(){
   	n = scan.nextInt();
   }

   public static void main (String Deepak[]){
   Pattern10 p = new Pattern10();
   for(int i=1;i<=p.n;i++){
   	for(int j=1;j<=p.n;j++){
      if(i==1 || j==1 || i==p.n || j==p.n){
       System.out.print(1);
      }
      else{
       System.out.print(0);
      }
   	}
   	System.out.println();
   }
   }

 
}