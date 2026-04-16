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

		int case_num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < case_num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int [] list = new int [10];
			
			for (int j = 0; j < 10; j++) list[j] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(list);
			
			bw.write(Integer.toString(list[7]));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

