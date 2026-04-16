import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;


public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int success = 0;
		String [] students = new String [n];
		
		for (int i = 0; i < n; i++) {
			students[i] = br.readLine();
		}
		
		int lastIndex = students[0].length();
		int startIndex = students[0].length()-1;
		int result = 0;
		
		while (success == 0) {
			Set<String> set = new HashSet<String>();

			for (int i = 0; i < n; i++) {
				set.add(students[i].substring(startIndex, lastIndex));
			}
			
			if (set.size() == n) {
				success = 1;
				result = lastIndex-startIndex;
				break;
			} else {
				startIndex --;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
		
	}
}
