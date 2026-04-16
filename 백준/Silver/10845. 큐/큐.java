import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			String [] ip = (br.readLine()).split(" ");
			int last_idx = list.size()-1;
			
			// push 
			if (ip[0].equals("push")) {
				list.add(Integer.parseInt(ip[1]));
				continue;
			} 
			
			// pop
			else if (ip[0].equals("pop")) {
				if (list.size() == 0) {
					bw.write("-1");
				} else {
					bw.write(Integer.toString(list.remove(0)));
				}
			}
			
			// size
			else if (ip[0].equals("size")) {
				bw.write(Integer.toString(list.size()));
			} 
			
			// empty
			else if (ip[0].equals("empty")) {
				if (list.isEmpty()) {
					bw.write(Integer.toString(1));
				} else {
					bw.write(Integer.toString(0));
				}
			}
			
			// front
			else if (ip[0].equals("front")) {
				if (list.size() == 0) {
					bw.write("-1");
				} else {
					bw.write(Integer.toString(list.get(0)));
				}
			} 
			
			// back
			else if (ip[0].equals("back")) {
				if (list.size() == 0) {
					bw.write("-1");
				} else {
					bw.write(Integer.toString(list.get(last_idx)));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		
		bw.close();
		br.close();
	}

}

