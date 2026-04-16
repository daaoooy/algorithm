import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int [] a = new int [n];
        int [] sortA = new int [n];
        int [] p = new int [n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
        	a[i] = Integer.parseInt(st.nextToken());
        	sortA[i] = a[i];
        }
        
        Arrays.sort(sortA);
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if (sortA[j] == a[i]) {
        			p[i] = j;
        			sortA[j] = -1;
        			break;
        		}
        	}
        }
        
        for (int i = 0; i < n; i++) {
        	bw.write(p[i] + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
        
        
        
        
    }
}
