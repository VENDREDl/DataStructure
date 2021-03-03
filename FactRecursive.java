import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int fac = 1;
		
		for(int i = num; i >= 1; i--) {
			fac = fac * i;
		}
		
		System.out.println(num + "의 팩토리얼은" + fac + "입니다.");
	}

}
