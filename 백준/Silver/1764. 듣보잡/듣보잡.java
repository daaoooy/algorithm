import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int lis = Integer.parseInt(st.nextToken());
		int see = Integer.parseInt(st.nextToken());
		
		HashSet<String> lis_list = new HashSet<>();
		HashSet<String> see_list = new HashSet<>();
		
		for (int i = 0; i < lis; i++) {
			lis_list.add(br.readLine());
		}
		
		for (int i = 0; i < see; i++) {
			see_list.add(br.readLine());
		}
		
		lis_list.retainAll(see_list);
		List<String> result = new ArrayList<>(lis_list);
		Collections.sort(result);
		
		bw.write(lis_list.size()+"\n");
		
		for (int i = 0; i < result.size(); i++) {
			bw.write(result.get(i) + "\n");
			bw.flush();
		}

		bw.close();
		br.close();
	}

}

