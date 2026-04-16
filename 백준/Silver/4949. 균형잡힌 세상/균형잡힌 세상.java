import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		while (!input.equals(".")) {

			int result = 1;
			String current = "";
			String nextExpect = "";
			List<String> list = new ArrayList<>();

			for (int i = 0; i < input.length(); i++) {
				current = Character.toString(input.charAt(i));
				// "("
				if (input.charAt(i) == '(') {
					nextExpect = ")";
					list.add(current);
				} 
				// ")"
				else if (input.charAt(i) == ')') {
					if (list.contains("(") && nextExpect.equals(current)) {
						list.remove(list.size()-1);

						if (list.size() > 0) {
							if (list.get(list.size()-1).equals("(")) {
								nextExpect = ")";
							} else if (list.get(list.size()-1).equals("[")) {
								nextExpect = "]";
							}			
						} else if (list.size() == 0) {
							nextExpect = "";
						}

					} else {
						result = 0;
						break;
					}
				}
				// "["
				else if (input.charAt(i) == '[') {
					nextExpect = "]";
					list.add(current);
				}
				// "]"
				else if (input.charAt(i) == ']') {
					if (list.contains("[") && nextExpect.equals(current)) {
						list.remove(list.size()-1);

						if (list.size() > 0) {
							if (list.get(list.size()-1).equals("(")) {
								nextExpect = ")";
							} else if (list.get(list.size()-1).equals("[")) {
								nextExpect = "]";
							}			
						} else if (list.size() == 0) {
							nextExpect = "";
						}

					} else {
						result = 0;
						break;
					}
				}
			}

			if (result == 1 && input.charAt(input.length()-1) == '.' && list.size() == 0) {
				bw.write("yes\n");
			} else if (result == 0 || input.charAt(input.length()-1) == '.' || list.size() != 0) {
				bw.write("no\n");
			}
			input = br.readLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}

