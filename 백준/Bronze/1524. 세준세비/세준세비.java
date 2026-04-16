import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int test_case = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_case; i++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			StringTokenizer jun = new StringTokenizer(br.readLine());
			int [] sejun = new int [n];
					
			for (int j = 0; j < n; j++) sejun[j] = Integer.parseInt(jun.nextToken());
		
			StringTokenizer bi = new StringTokenizer(br.readLine());
			int [] sebi = new int [m];
			
			for (int j = 0; j < m; j++) sebi[j] = Integer.parseInt(bi.nextToken());
			
			int sejun_max = sejun[0];
			int sebi_max = sebi[0];
			
			for (int j = 1; j < n; j++)
				if (sejun_max < sejun[j]) sejun_max = sejun[j];
			
			for (int j = 1; j < m; j++)
				if (sebi_max < sebi[j]) sebi_max = sebi[j];
			
			if (sejun_max >= sebi_max) bw.write("S\n");
			else if (sejun_max < sebi_max) bw.write("B\n");
			else bw.write("C\n");
		}

		bw.flush();
		bw.close();

	}

}

