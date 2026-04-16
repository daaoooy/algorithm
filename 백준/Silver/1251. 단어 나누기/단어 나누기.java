import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringBuilder word = new StringBuilder(input);
        String result = null;
        
        for (int i = 1; i < word.length()-1; i++) {
        	for (int j = i+1; j < word.length(); j++) {
        		StringBuilder first = new StringBuilder(word.substring(0, i));
        		StringBuilder second = new StringBuilder(word.substring(i, j));
        		StringBuilder third = new StringBuilder(word.substring(j));
        		
        		first = first.reverse();
        		second = second.reverse();
        		third = third.reverse();
        		
        		String combined = first.toString() + second.toString() + third.toString();
        		
        		
        		if (result == null || combined.compareTo(result) < 0) {
        			result = combined;
        		}
        	}
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
        
    }
}
