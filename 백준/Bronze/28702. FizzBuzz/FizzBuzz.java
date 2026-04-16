import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] input = new String [3];

		int result = 0;

		for (int i = 0; i < 3; i++) {
			input[i] = br.readLine();
		}


		if (isNumber(input[0])) {
			result = Integer.parseInt(input[0]) + 3;
		} else {
			if (isNumber(input[1])) {
				result = Integer.parseInt(input[1]) + 2;
			} else {
				if (isNumber(input[2])) {
					result = Integer.parseInt(input[2]) + 1;
				}
			}
		}


		if (result % 3 == 0 && result % 5 == 0) {
			bw.write("FizzBuzz");
		} 
		else if (result % 3 == 0) {
			bw.write("Fizz");
		}
		else if (result % 5 == 0 ) {
			bw.write("Buzz");
		} else {
			bw.write(Integer.toString(result));
		}

		bw.flush();
		bw.close();
		br.close();

	}

	public static boolean isNumber(String str) {
		return str.matches("[+-]?\\d*(\\.\\d+)?");
	}

}

