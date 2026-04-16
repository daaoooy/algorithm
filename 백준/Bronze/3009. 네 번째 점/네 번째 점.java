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

		int a1 = Integer.parseInt(st1.nextToken());
		int a2 = Integer.parseInt(st1.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int b1 = Integer.parseInt(st2.nextToken());
		int b2 = Integer.parseInt(st2.nextToken());

		StringTokenizer st3 = new StringTokenizer(br.readLine());

		int c1 = Integer.parseInt(st3.nextToken());
		int c2 = Integer.parseInt(st3.nextToken());
		
		int d1 = 0;
		int d2 = 0;
		
		if (a1 == b1) {
			d1 = c1;
		}
		else if (a1 == c1) {
			d1 = b1;
		}
		else if (b1 == c1) {
			d1 = a1;
		}
		
		if (a2 == b2) {
			d2 = c2;
		}
		else if (a2 == c2) {
			d2 = b2;
		}
		else if (b2 == c2) {
			d2 = a2;
		}

		bw.write(Integer.toString(d1) + " " + Integer.toString(d2));
		bw.flush();
		bw.close();

	}

}

