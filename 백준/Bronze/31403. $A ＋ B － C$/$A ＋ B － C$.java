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

		// StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
	
		int first = a + b - c;
		int second = Integer.parseInt(Integer.toString(a) + Integer.toString(b))-c;
		
		bw.write(Integer.toString(first) + "\n");
		bw.write(Integer.toString(second));
		bw.flush();
		bw.close();
		br.close();
	}
	
}

