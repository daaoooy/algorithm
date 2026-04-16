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
		
		StringTokenizer st = new StringTokenizer (br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int a = 100 - n;
		int b = 100 - m;
		
		int c = 100 - (a + b);
		int d = a * b;
		
		int q = d / 100;
		int r = d % 100;
		
		int front = c;
		int behind = d;
		
		if (d > 99) {
			front = c + q;
			behind = r;
		}
		
		bw.write(Integer.toString(a) + " ");
		bw.write(Integer.toString(b) + " ");
		bw.write(Integer.toString(c) + " ");
		bw.write(Integer.toString(d) + " ");
		bw.write(Integer.toString(q) + " ");
		bw.write(Integer.toString(r) + " ");
		bw.newLine();
		bw.write(Integer.toString(front) + " " + Integer.toString(behind));
		
		
		
		
		bw.flush();
		bw.close();

	}

}

