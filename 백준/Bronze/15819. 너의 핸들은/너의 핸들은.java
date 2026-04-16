import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		String [] ip = (input.nextLine()).split(" ");
		int n = Integer.parseInt(ip[0]);
		int p = Integer.parseInt(ip[1]);
		
		String [] arr = new String [n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextLine();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[p-1]);
	}

}

