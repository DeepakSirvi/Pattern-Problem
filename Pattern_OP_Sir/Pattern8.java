import java.util.Scanner;
/** n=5
 1
 1 2
 3 5 8
 13 21 34 55
 89 144 233 377 610
 */
class Pattern8{
	int n,f,s;
	Scanner scan = new Scanner(System.in); 
   Pattern8(){
   	n = scan.nextInt();
      f=0;
      s=1;

   }

   public static void main (String Deepak[]){
   Pattern8 p = new Pattern8();
   int sum=0;
   for(int i=1;i<=p.n;i++){
   	for(int j=1;j<=i;j++){
         System.out.print(p.s+" ");
         sum=p.f+p.s;
         p.f=p.s;
         p.s=sum;
   	}
   	System.out.println();
   }
   }

 
}