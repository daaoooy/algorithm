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
		
		int [] list = new int [5];
		
		for (int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		int s = 0;
		int average = 0;
		int mid = 0;
		
		Arrays.sort(list);
		
		for (int i = 0; i < 5; i++) {
			s += list[i];
		}
		
		average = s / 5;
		mid = list[2];
		
		bw.write(Integer.toString(average));
		bw.newLine();
		bw.write(Integer.toString(mid));
		
		bw.flush();
		bw.close();

	}

}

