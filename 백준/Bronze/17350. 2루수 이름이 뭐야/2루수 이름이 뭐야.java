import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String [] inputs = new String [n];
		
		for (int i = 0; i < n; i++) {
			inputs[i] = br.readLine();
		}
		
		int contain = 0;
		
		for (int i = 0; i < n; i++) {
			if (inputs[i].equals("anj")) {
				contain = 1;
			}
		}
		
		if (contain == 0) {
			bw.write("뭐야?");
		}
		else {
			bw.write("뭐야;");
		}
		
		bw.flush();
		bw.close();

	}

}

