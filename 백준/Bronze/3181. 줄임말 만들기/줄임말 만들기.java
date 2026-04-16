import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] word = (br.readLine()).split(" ");
		String [] pass = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
		String result = "";
		int check = 0;
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < pass.length; j++) {
				if (i == 0) {
					result += word[i].charAt(0);
					break;
				}
				else {
					if (word[i].equals(pass[j])) {
						check = 1;
						break;
					}
					else {
						check = 0;
					}
				}
			}
			
			if (check == 0 && i != 0) result += word[i].charAt(0);
		}
		
		result = result.toUpperCase();
		
		bw.write(result);
		
		bw.flush();
		bw.close();

	}

}

