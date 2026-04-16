import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String [] list = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		int i = 0;
		int alpha_num = 0;

		String [] str = (input.nextLine()).split("");

		while (i+1 < str.length) {
			String check = str[i] + str[i+1];
			for (int j = 0; j < list.length; j++) { 
				if (list[j].equals(check)) {
					i += 2;
					alpha_num += 1;
					break;
				}
				else {
					if (j < list.length-1) {
						if (i+2 < str.length) {
							String second_check = str[i] + str[i+1] + str[i+2];
							if (second_check.equals(list[2])) {
								i += 3;
								alpha_num += 1;
								break;
							}
						}
					}
					else if (j == list.length-1) {
						i += 1;
						alpha_num += 1;
					}		
				}
			}
		}

		if (i < str.length) {
			alpha_num += 1;
			System.out.println(alpha_num);
		}
		else if (i == str.length) {
			System.out.println(alpha_num);
		}

		input.close();
	}

}
