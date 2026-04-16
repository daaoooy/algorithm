import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		while (t-- > 0) {
			int [] nums = new int [7];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = input.nextInt();
			}
			
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] % 2 != 0) {
					nums[i] = -1;
				}
			}
			
			int even_sum = 0;
			int even_n = 0;
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != -1) {
					even_sum += nums[i];
					even_n ++;
				}
			}
			
			int [] even = new int [even_n];
			int tmp = 0;
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != -1) {
					even[tmp++] = nums[i];
				}
			}
			
			int even_min = even[0];
			
			for (int i = 1; i < even.length; i++) {
				if (even_min > even[i]) {
					even_min = even[i];
				}
			}
			
			System.out.println(even_sum + " " + even_min);
		}
	}

}

