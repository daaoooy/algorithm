import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringBuilder word = new StringBuilder(input);
        List<String> list = new ArrayList<>();
        
        for (int i = 2; i < word.length(); i++) {
        	for (int j = 1; j < i; j++) {
        		StringBuilder first = new StringBuilder(word.substring(0, j));
        		StringBuilder second = new StringBuilder(word.substring(j, i));
        		StringBuilder third = new StringBuilder(word.substring(i));
        		
        		first = first.reverse();
        		second = second.reverse();
        		third = third.reverse();
        		
        		String result = first.toString() + second.toString() + third.toString();
        		list.add(result);
        	}
        }
        
        Collections.sort(list);
        bw.write(list.get(0));
        bw.flush();
        bw.close();
        br.close();
        
    }
}
