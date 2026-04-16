import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		double total = 0;
		int n = 0;
		
		String inp = br.readLine();
		
		for (int i = 0; i < inp.length(); i++) {
			if (inp.charAt(i) == 'A') {
				total += 4;
				n += 1;
			}
			else if (inp.charAt(i) == 'B') {
				total += 3;
				n += 1;
			}
			else if (inp.charAt(i) == 'C') {
				total += 2;
				n += 1;
			}
			else if (inp.charAt(i) == 'D') {
				total += 1;
				n += 1;
			}
			else if (inp.charAt(i) == 'F') {
				total += 0;
				n += 1;
			}
			else if (inp.charAt(i) == '+') {
				total += 0.5;
			}
		}
		
		bw.write(Double.toString(total / n));
		bw.flush();
		bw.close();

	}

}

