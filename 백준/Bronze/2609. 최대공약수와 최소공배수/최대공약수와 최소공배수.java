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

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gcd = b;
		int lcm = a*b;
		
		int tmp;
		if (b < a) {
			tmp = a;
			a = b;
			b = tmp;
		}

		while (a % b != 0 && a != 0) {
			gcd = a % b;
			a = b;
			b = gcd;
		}

		lcm /= gcd;
		bw.write(Integer.toString(gcd) + "\n" + Integer.toString(lcm));

		bw.flush();
		bw.close();
		br.close();
	}

}

