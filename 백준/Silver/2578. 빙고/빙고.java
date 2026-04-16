import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] me = new int[5][5];
		HashMap<Integer, int[]> location = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				me[i][j] = Integer.parseInt(st.nextToken());
				location.put(me[i][j], new int[]{i, j});
			}
		}

		int result = 0;

		int[] row = new int[5]; 
		int[] col = new int[5]; 
		int d1 = 0;
		int d2 = 0;

		int bingo = 0;
		int finish = 0;

		while(finish == 0) {
			for (int i = 0; i < 5; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while (st.hasMoreTokens()) {
					result ++;

					int mc = Integer.parseInt(st.nextToken());
					if (location.containsKey(mc)) {
						int x = location.get(mc)[0];
						int y = location.get(mc)[1];
						me[x][y] = 0;

						row[x] ++;
						col[y] ++;

						if (row[x] == 5) bingo ++;
						if (col[y] == 5) bingo ++;
						if (x == y) {
							d1 ++;
							if (d1 == 5) bingo ++;
						}
						if (x + y == 4) {
							d2 ++;
							if (d2 == 5) bingo ++;
						}

						if (bingo >= 3) {
							bw.write(Integer.toString(result));
							finish = 1;
							break;
						}
					}
				}
				if (finish == 1) break;
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
