import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	   Scanner sc = new Scanner(System.in);
      // getting values from user
      int n1 = sc.nextInt();
      int count = 1;
      // looping 
      while(count <= n1)
      {
       System.out.println("I am a Java Developer");
        count = count + 1;
      }
	}
}