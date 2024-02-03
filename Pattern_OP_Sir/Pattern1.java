import java.util.Scanner;
/** n=4
 1234
 2341
 3412
 4321
 */
class Pattern1{
	int n;
	Scanner scan = new Scanner(System.in); 
   Pattern1(){
   	n = scan.nextInt();
   }

   public static void main (String Deepak[]){
   Pattern1 p = new Pattern1();
   for(int i=1;i<=p.n;i++){
   int 	t=i;
   	for(int j=1;j<=p.n;j++){
      System.out.print(t);
      if(t==p.n){
       t=1;
      }
      else{
      	t++;
      }
   	}
   	System.out.println();
   }
   }

 
}