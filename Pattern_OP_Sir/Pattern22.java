import java.util.Scanner;
/** 
 * n=4572
  4572
  572
  72
  2

 */
class Pattern22
{
	Scanner scan = new Scanner(System.in);
	Integer n;
	Pattern22()
	{
		n = scan.nextInt();
	}

	public static void main(String Deepak[])
	{
		Pattern22 p = new Pattern22();
		String s = p.n.toString();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.substring(i));
		}

	}
}