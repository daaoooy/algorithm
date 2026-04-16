import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N= input.nextInt();
		
		ArrayList<Integer> ip = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) ip.add(input.nextInt());
		
		Collections.sort(ip);
		
		for (int i = 0; i < N; i++) sb.append(ip.get(i)).append("\n");
		
		System.out.println(sb);
		
		input.close();
	}

}

