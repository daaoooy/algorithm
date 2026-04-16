import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();	
		
		while(k-- > 0) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) {
				list.remove(list.size()-1);
			}
			else {
				list.add(a);
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		
		bw.close();
		br.close();
	}

}

