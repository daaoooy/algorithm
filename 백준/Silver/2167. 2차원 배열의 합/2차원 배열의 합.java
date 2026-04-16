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
		
		StringTokenizer size = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(size.nextToken());
		int m = Integer.parseInt(size.nextToken());
		
		int [][] arr = new int [n][m];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for (int l = 0; l < k; l++) {
			StringTokenizer ijxy = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(ijxy.nextToken());
			int j = Integer.parseInt(ijxy.nextToken());
			int x = Integer.parseInt(ijxy.nextToken());
			int y = Integer.parseInt(ijxy.nextToken());
			
			int sum = 0;
			
			for (int a = i-1; a < x; a++) {
				for (int b = j-1; b < y; b++) {
					sum += arr[a][b];
				}
			}
			
			bw.write(Integer.toString(sum));
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}
	
}

