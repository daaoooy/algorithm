import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int case_num = Integer.parseInt(br.readLine());
		String [] word = new String[case_num];
		
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < case_num; i++)
			word[i] = br.readLine();
		
		for (String i:word) {
			set.add(i);
		}
		
		String [] list = new String [set.size()];
		
		int idx = 0;
		
		for (String s : set) {
			list[idx++] = s;
 		}
		
		Arrays.sort(list);
		Arrays.sort(list, new Comparator<String> () {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});		
		
		for (int i = 0; i < list.length; i++) {
			bw.write(list[i]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();

	}

}

