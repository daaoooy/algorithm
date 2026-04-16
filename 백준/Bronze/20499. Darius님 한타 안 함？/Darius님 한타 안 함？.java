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

		String [] input = (br.readLine()).split("/");
		int [] kda = new int [input.length];
		
		for (int i = 0; i < input.length; i++) {
			kda[i] = Integer.parseInt(input[i]);
		}
		
		if ((kda[0] + kda[2] < kda[1]) || kda[1] == 0) {
			bw.write("hasu");
		}
		else {
			bw.write("gosu");
		}

		bw.flush();
		bw.close();

	}

}

