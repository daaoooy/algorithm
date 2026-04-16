import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int d = 1;  
        int c = 0;
        int where, a, b;
        
        while (c + d < n) {
            c += d;
            d++;
        }
    
        where = n - c;
        
        if (d % 2 == 0) {
            a = where;       
            b = d - where + 1; 
        } else {
            a = d - where + 1; 
            b = where;       
        }
       
        bw.write(Integer.toString(a) + "/" + Integer.toString(b));
        bw.flush();
        bw.close();
        br.close();
    }
}
