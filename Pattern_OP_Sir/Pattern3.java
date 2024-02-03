import java.util.Scanner;
/** n=5
 11111
 1   1
 1   1 
 1   1
 11111
 */
class Pattern3{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern3(){
   	n = scan.nextInt();
   }

   public static void main (String Deepak[]){
   Pattern3 p = new Pattern3();
   for(int i=1;i<=p.n;i++){
   	for(int j=1;j<=p.n;j++){
      if(i==1 || j==1 || i==p.n || j==p.n){
       System.out.print(1);
      }
      else{
       System.out.print(" ");
      }
   	}
   	System.out.println();
   }
   }

 
}