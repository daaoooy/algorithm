import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] me = new int[5][5];
		HashMap<Integer, int[]> board = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int num = Integer.parseInt(st.nextToken());
				me[i][j] = num;
				board.put(num, new int[]{i, j});
			}
		}

		int cnt = 0;
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
					cnt++;
					int mc = Integer.parseInt(st.nextToken());
					if (board.containsKey(mc)) {
						int x = board.get(mc)[0];
						int y = board.get(mc)[1];
						me[x][y] = 0;
						
						if (++row[x] == 5) bingo++;
						if (++col[y] == 5) bingo++;
						if (x == y && ++d1 == 5) bingo++;
						if (x + y == 4 && ++d2 == 5) bingo++;

						if (bingo >= 3) {
							bw.write(Integer.toString(cnt));
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
