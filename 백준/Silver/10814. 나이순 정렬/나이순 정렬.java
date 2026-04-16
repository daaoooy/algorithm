import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Info> list = new ArrayList<Info>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Info info = new Info(Integer.parseInt(st.nextToken()), i, st.nextToken());
			list.add(info);
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			bw.write((list.get(i)).getAge() + " " + (list.get(i)).getName() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}

class Info implements Comparable<Info> {
	int age;
	int seq;
	String name;
	
	public Info(int age, int seq, String name) {
		this.age = age;
		this.seq = seq;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getSeq() {
		return seq;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Info o) {
		// TODO Auto-generated method stub
		
		if (this.age > o.age) return 1;
		else if (this.age == o.age) {
			if (this.seq > o.seq) return 1;
		}
		return -1;
	}
	
	
}

