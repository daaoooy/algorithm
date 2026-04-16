import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] input_str = (br.readLine()).split(",");
		int [] input_int = new int [input_str.length];

		for (int i = 0; i < input_str.length; i++) {
			input_int[i] = Integer.parseInt(input_str[i]);
		}

		int result = 0;

		for (int i = 0; i < input_int.length; i++) {
			result += input_int[i];
		}

		bw.write(Integer.toString(result));

		bw.flush();
		bw.close();

	}

}

