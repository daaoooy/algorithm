import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int [] input = new int [10];
		
		for (int i = 0; i < 10; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(input);
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum += input[i];
		}
		
		int average = sum / 10;
		
		Set<Integer> e = new HashSet<>();
		
		for (int i : input) {
		    e.add(i);
		}
		
		int[] elements = new int[e.size()];
		
		int index = 0;
		for (int i : e) {
			elements[index++] = i;
		}  
		
		int [] check = new int [e.size()];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (input[i] == elements[j]) {
					check[j] ++;
					break;
				}
			}
		}
		
		int max = check[0];
		int max_idx = 0;
		
		for (int i = 0; i < check.length; i++) {
			if (max < check[i]) {
				max = check[i];
				max_idx = i;
			}
		}
		
		bw.write(Integer.toString(average));
		bw.newLine();
		bw.write(Integer.toString(elements[max_idx]));
		bw.flush();
		bw.close();

	}

}

