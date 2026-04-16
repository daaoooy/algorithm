import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int charge = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String [] time = (st.nextToken()).split(":");
			int hour = Integer.parseInt(time[0]);
			int min = Integer.parseInt(time[1]);

			int callTime = Integer.parseInt(st.nextToken());

			while (callTime != 0) { 
				if (hour >= 7 && hour < 19) {
					charge += 10;
				} else if (hour >= 19 || hour < 7) {
					charge += 5;
				}
				
				min += 1;
				callTime --;
				
				if (min >= 60) {
					hour += 1;
					min = 0;
				}
				
				if (hour >= 24) {
					hour = 0;
				}
			}
		}
		
		bw.write(Integer.toString(charge) + "\n");
		bw.flush();
		bw.close();
		br.close();


	}
}

