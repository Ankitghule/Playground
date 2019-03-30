import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for (int c = 1;c<=n*2;c++)
         {
           if(c%2==1)
           {
             System.out.println(c);
           }
           c = c+1;
         }
	}
}