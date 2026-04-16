import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] color = {"black", "brown", "red", "orange", "yellow", "green",
				"blue", "violet", "grey", "white"};
		
		String first = br.readLine();
		String second = br.readLine();
		String third = br.readLine();
		
		String value = "";
		
		for (int i = 0; i < color.length; i++) {
			if (first.equals(color[i])) {
				value += i;
				break;
			}
		}
		
		for (int i = 0; i < color.length; i++) {
			if (second.equals(color[i])) {
				value += i;
				break;
			}
		}
		
		double result = Double.parseDouble(value);
		
		for (int i = 0; i < color.length; i++) {
			if (third.equals(color[i])) {
				result = result * (Math.pow(10, i));
				break;
			}
		}
		
		bw.write(Long.toString((long)result));
		bw.flush();
		bw.close();

	}

}

