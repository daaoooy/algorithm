import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String yeondu = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			
			int L = 0;
			int O = 0;
			int V = 0;
			int E = 0;
			
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == 'L') L++;
				else if (input.charAt(j) == 'O') O++;
				else if (input.charAt(j) == 'V') V++;
				else if (input.charAt(j) == 'E') E++;
			}
			
			for (int j = 0; j < yeondu.length(); j++) {	
				if (yeondu.charAt(j) == 'L') L++;
				else if (yeondu.charAt(j) == 'O') O++;
				else if (yeondu.charAt(j) == 'V') V++;
				else if (yeondu.charAt(j) == 'E') E++;
			}
			
			int prob = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
		
			map.put(input, prob);
		}
		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		
		entryList.sort((e1, e2) -> {
			int compareProb = e2.getValue().compareTo(e1.getValue());
			if (compareProb == 0) {
				return e1.getKey().compareTo(e2.getKey());
			}
			return compareProb;
		});
		
		Map.Entry<String, Integer> max = entryList.get(0);
		
		bw.write(max.getKey());
		bw.flush();
		bw.close();
		br.close();

	}
}

