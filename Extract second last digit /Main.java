import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       int n1 = (i%100)/10;
       System.out.println(n1);
	}
}