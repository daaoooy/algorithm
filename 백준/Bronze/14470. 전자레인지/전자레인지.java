import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine()); // 원래의 고기 온도
		int b = Integer.parseInt(br.readLine()); // 목표 온도
		int c = Integer.parseInt(br.readLine()); // 얼어 있는 고기 1도 올리는데 걸리는 시간
		int d = Integer.parseInt(br.readLine()); // 얼어 있는 고기 해동하는데 걸리는 시간
		int e = Integer.parseInt(br.readLine()); // 안 얼어 있는 고기 1도 올리는데 걸리는 시간
		
		int time = 0;
		int check = 0;
		
		while (a != b) {
			if (a < 0) {
				a += 1;
				time += c;
			}
			else if (a >= 0) {
				if (check == 0 && a == 0) {
					time += d;
					check = 1;
				}
				else if (check == 1 && a == 0) {
					time += e;
					a += 1;
				}
				else {
					time += e;
					a += 1;
				}
			}
		}
		
		bw.write(Integer.toString(time));
		bw.flush();
		bw.close();

	}

}

