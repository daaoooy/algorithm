import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		List<Point> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new Point(x, y));			
		}
		
		Collections.sort(list);
		
		for (Point p : list) {
		    bw.write(p + "");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

class Point implements Comparable<Point> {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if (this.y == o.y) {
			return Integer.compare(this.x, o.x);
		}
		
		return Integer.compare(this.y, o.y);
	}

	@Override
	public String toString() {
		return x + " " + y + "\n";
	}
	
}
