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

		StringTokenizer A_box = new StringTokenizer(br.readLine());
		
		int A_apple = Integer.parseInt(A_box.nextToken());
		int A_orange = Integer.parseInt(A_box.nextToken());
		
		StringTokenizer B_box = new StringTokenizer(br.readLine());
		
		int B_apple = Integer.parseInt(B_box.nextToken());
		int B_orange = Integer.parseInt(B_box.nextToken());
		
		int case1 = A_apple + B_orange;
		int case2 = B_apple + A_orange;
		
		if(case1 < case2) bw.write(Integer.toString(case1));
		else bw.write(Integer.toString(case2));

		bw.flush();
		bw.close();

	}

}

