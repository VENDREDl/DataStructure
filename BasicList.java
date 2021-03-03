import java.util.Scanner;

public class BasicList {

	public static void main(String[] args) {
		int arr[];
		arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
			int i;
			for(i = 0; i < 5; i++) {		
				int data = sc.nextInt();
				arr[i] = data;
			}
			
			for(int j = 0; j < 5; j++) {
				System.out.println(arr[j]);
			}
		}
			

}
