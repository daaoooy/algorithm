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
		
		StringTokenizer st = new StringTokenizer (br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int [] cases = new int [3];
		
		cases[0] = Math.abs((a+b)-(c+d));
		cases[1] = Math.abs((a+c)-(b+d));
		cases[2] = Math.abs((a+d)-(b+c));
		
		int min = cases[0];
		
		for (int i = 0; i < cases.length; i++) { 
			if (cases[i] < min) {
				min = cases[i];
			}
		}
		
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();

	}

}

