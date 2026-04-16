import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testcase; i++) {
			int cent = Integer.parseInt(br.readLine());
		
			int q = Math.floorDiv(cent, 25);
			int d = Math.floorDiv(cent - 25*q, 10);
			int n = Math.floorDiv(cent - 25*q - 10*d, 5);
			int p = Math.floorDiv(cent - 25*q - 10*d - 5*n, 1);
			
			bw.write(Integer.toString(q) + " ");
			bw.write(Integer.toString(d) + " ");
			bw.write(Integer.toString(n) + " ");
			bw.write(Integer.toString(p) + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}

