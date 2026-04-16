import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	int cnt = map.getOrDefault(num, 0);
        	
        	if (cnt != 0) {
        		bw.write(Integer.toString(1) + "\n");
        	}
        	else {
        		bw.write(Integer.toString(0) + "\n");
        	}
        }
        
        bw.flush();
        bw.close();
        br.close();
        
    }
}
