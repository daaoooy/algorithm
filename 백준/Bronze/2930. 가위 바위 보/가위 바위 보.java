import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int round = Integer.parseInt(br.readLine());
		String [] sang = (br.readLine()).split("");
		int n = Integer.parseInt(br.readLine());

		int score = 0;
		int max_score = 0;

		String [][] friends = new String[n][round];

		for (int i = 0; i < n; i++) {
			friends[i] = (br.readLine()).split(""); 
		}

		// 점수
		for (int i = 0; i < round; i++) {
			for (int j = 0; j < n; j++) {
				if (sang[i].equals(friends[j][i])) {
					score += 1;
				} 
				else if (sang[i].equals("R")) {
					if (friends[j][i].equals("S")) score += 2;
					else if (friends[j][i].equals("P")) score += 0;
				}
				else if (sang[i].equals("S")) {
					if (friends[j][i].equals("R")) score += 0;
					else if (friends[j][i].equals("P")) score += 2;
				}
				else if (sang[i].equals("P")) {
					if (friends[j][i].equals("S")) score += 0;
					else if (friends[j][i].equals("R")) score += 2;
				}
			}
		}

		// 최고 점수
		for (int i = 0; i < round; i++) {
			int r = 0; // 주먹을 냈을 때 점수
			int s = 0; // 가위를 냈을 때 점수
			int p = 0; // 보를 냈을 때 점수

			for (int j = 0; j < n; j++) {			
				if (friends[j][i].equals("S"))  r += 2; 
                else if (friends[j][i].equals("P")) s += 2; 
                else if (friends[j][i].equals("R")) p += 2;

                if (friends[j][i].equals("R")) r += 1; 
                if (friends[j][i].equals("S")) s += 1; 
                if (friends[j][i].equals("P")) p += 1; 
			}
			
			max_score += Math.max(r, Math.max(s, p));
		}

		bw.write(Integer.toString(score) + "\n" + Integer.toString(max_score));

		bw.flush();
		bw.close();
		br.close();




	}
}
