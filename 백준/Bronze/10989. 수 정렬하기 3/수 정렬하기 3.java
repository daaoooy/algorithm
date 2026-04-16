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
		int [] num_list = new int[n];
		
		for (int i = 0; i < n; i++) {
			num_list[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num_list);
		
		for (int i = 0; i < n;i ++) {
			bw.write(Integer.toString(num_list[i]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

