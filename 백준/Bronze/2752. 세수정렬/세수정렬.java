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
		
		String [] input = (br.readLine()).split(" ");
		int [] numList = new int [3];
		
		for (int i = 0; i < 3; i++) {
			numList[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(numList);
		
		for (int i = 0; i < 3; i++) 
			bw.write(Integer.toString(numList[i]) + " ");
		
		bw.flush();
		bw.close();

	}

}

