import java.util.Scanner;
class Main
{
  public static int square(int a)
  {
    int s = a*a;
    return s;
  }
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int b = square(n1);
      System.out.println(b);
	} 
}