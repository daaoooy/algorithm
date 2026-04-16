import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] input = (br.readLine()).split("");
		int cnt = 0;
		String prev = input[0];
		int change = 0;
		
		for (int i = 1; i < input.length; i++) {
			if (!prev.equals(input[i])) {
				if (change == 0) {
					cnt ++;
					change = 1;
				} 
				else if (change == 1) {
					change = 0;
				}
			}
			prev = input[i];
		}

		bw.write(Integer.toString(cnt));
		
		bw.flush();
		bw.close();
		br.close();
	}

}

