import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List <Body> list = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new Body(x, y, 1));
		}
		
		
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				} else {
					if (list.get(i).x < list.get(j).x && list.get(i).y < list.get(j).y) {
						list.get(i).rank ++;
 					}
				}
			}
		}
		
		for (Body entry : list) {
			bw.write(Integer.toString(entry.rank) + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

class Body {
	int x, y, rank;
	
	public Body(int x, int y, int rank) {
		this.x = x;
		this.y = y;
		this.rank = rank;
	}
	
}
