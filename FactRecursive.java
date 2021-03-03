import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.print(fact(num));
}
	
	public static int fact(int n) {
		if(n <= 1)
			return n;
		else
			return fact(n-1) * n;
	}

}