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
		
		StringTokenizer fl = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(fl.nextToken());
		int k = Integer.parseInt(fl.nextToken());
		
		StringTokenizer sl = new StringTokenizer(br.readLine());
		
		int [] list = new int [n];
		
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(sl.nextToken());
		}
		
		Arrays.sort(list);
		
		bw.write(Integer.toString(list[n-k]));
		
		bw.flush();
		bw.close();

	}

}

