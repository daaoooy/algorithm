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

		int ip = Integer.parseInt(br.readLine());

		if (ip == 1010) {
			bw.write(Integer.toString(20));
		}
		else if (ip % 10 == 0) {
			ip /= 100;
			bw.write(Integer.toString(ip + 10));
		}
		else {
			int a = ip;
			int b = 0;
			b += a % 10;
			a /= 10;
			if (a == 10) {
				bw.write(Integer.toString(10+b));
			}
			else {
				bw.write(Integer.toString(a + b));
			}
		}

		bw.flush();
		bw.close();

	}

}

