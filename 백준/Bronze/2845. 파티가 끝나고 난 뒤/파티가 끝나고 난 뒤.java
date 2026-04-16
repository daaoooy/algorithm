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
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int m2 = Integer.parseInt(st1.nextToken());
		int area = Integer.parseInt(st1.nextToken());
		
		int sang = m2 * area;
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int [] article = new int [5];
		
		for (int i = 0; i < 5; i++) {
			article[i] = Integer.parseInt(st2.nextToken());
		}
		
		for (int i = 0; i < 5; i++) {
			bw.write(Integer.toString(article[i] - sang) + " ");
		}
		
		bw.flush();
		bw.close();

	}

}

