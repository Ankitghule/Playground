import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      System.out.println(sum(n1));
	}
  public static int sum(int y)
  {
    int s = 0;
    for (int i = 1 ; i <= y ; i++)
    {
      s = s + i;
    }
    return s;
  }
}