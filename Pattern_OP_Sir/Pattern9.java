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
class Pattern9
{
    Scanner scan = new Scanner(System.in);
    int n;
    Pattern9()
    {
        n = scan.nextInt();
    }


    public static void main(String Deepak[])
    {
        Pattern9 p = new Pattern9();
        for(int i=1;i<p.n*2;i++)
        {
            int t=p.n;
            for(int j=1;j<p.n*2;j++)
            {
                System.out.print(t+" ");
                if(j<i)
                {
                    t--;
                }
                if(j>(p.n*2-1)-i)
                {
                    t++;
                }
 
            }
          System.out.println();
        }


    }
}