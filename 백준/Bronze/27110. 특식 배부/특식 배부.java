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
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int x, y, z;
		
		if (n >= a) x = a;
		else x = n;
		
		if (n >= b) y = b;
		else y = n;
		
		if (n >= c) z = c;
		else z = n;
		
		int result = x + y + z;
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();

	}

}

