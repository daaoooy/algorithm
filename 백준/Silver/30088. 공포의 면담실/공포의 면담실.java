import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] input = new int[n][];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int employee = Integer.parseInt(st.nextToken());
			input[i] = new int[employee];
			for (int j = 0; j < employee; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int [] sum_list = new int [n];
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < input[i].length; j++) {
				sum += input[i][j];
			}
			sum_list[i] = sum;
		}
		
		Arrays.sort(sum_list);
		
		int [] prefix = new int [sum_list.length];
		
		prefix[0] = sum_list[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i-1] + sum_list[i];
		}
		
		int total_sum = 0;
		
		for (int i = 0; i < n; i++) {
			total_sum += prefix[i];
		}
		
		bw.write(Integer.toString(total_sum));
		bw.flush();
		bw.close();

	}
	
}

