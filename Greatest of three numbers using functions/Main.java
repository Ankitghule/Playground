import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       int result = greatest_number(n1 , n2);
       System.out.print(greatest_number(result , n3));
	}
   public static int greatest_number(int num1 , int num2)
   {
     int max_no = 0;
     if(num1 > num2)
     {
       max_no = num1;
     }
     else
     {
       max_no = num2;
     }
     return max_no;
   }
}