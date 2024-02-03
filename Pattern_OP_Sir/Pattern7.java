import java.util.Scanner;
/** 
 555555555
 544444445
 543333345
 543222345
 543212345
 543222345
 543333345
 544444445
 555555555
 */
class Pattern7
{
 int n,val,start,end,size;
 int arr[][];
 Scanner scan = new Scanner(System.in); 
   Pattern7()
   {
   	 n = scan.nextInt();
     size=n*2-1;
     arr = new int[size][size];
     val=n;
     start = 0;
     end = size-1;
   }

   public static void main (String Deepak[])
 {
   Pattern7 p = new Pattern7();
    while(true)
    {
       for(int i=p.start;i<=p.end;i++)
       {
   	     for(int j=p.start;j<=p.end;j++)
          {
            if(i==p.start || j==p.end || i==p.end || j==p.start)
           {
             p.arr[i][j]=p.val;
            }
          }
        }
       p.start++;
       p.end--;
       p.val--;
       if(p.val==0)
       {
         break;
        }
    }
   for(int i=0;i<p.size;i++)
   {
     for(int j=0;j<p.size;j++)
     {
       System.out.print(p.arr[i][j]+" ");
      } 
      System.out.println();
    }
  } 
}