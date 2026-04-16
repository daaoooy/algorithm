import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int caseNum = Integer.parseInt(br.readLine());
		int groupWord = 0;
		
		for (int i = 0; i < caseNum; i++) {
			String [] word = (br.readLine()).split("");
			ArrayList <String> arr = new ArrayList<String>();
			
			int idx = 0;
			arr.add(word[0]);
			
			int isGroup = 1;
			
			while (idx+1 < word.length) {
				if (word[idx].equals(word[idx+1])) {
					idx ++;
				}
				else {
					if (arr.contains(word[idx+1])) {
						isGroup = 0;
						break;
					}
					else {
						arr.add(word[idx+1]);
						idx ++;
					}
				}
			}
			
			if (isGroup == 1) groupWord ++;
		}
		
		bw.write(Integer.toString(groupWord));
		
		bw.flush();
		bw.close();

	}

}

