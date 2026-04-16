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
		
		int total_price = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		
		int my_total_price = 0;
		
		for (int i = 0; i < num; i++) {		
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());		
			my_total_price += (price * n);
		}
		
		if (total_price == my_total_price) 
			bw.write("Yes");
		else
			bw.write("No");
		
		bw.flush();
		bw.close();
		
	}

}

