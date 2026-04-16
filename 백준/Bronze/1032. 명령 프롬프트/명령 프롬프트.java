import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int count = 0;

		String [] files = new String [num];
		input.nextLine();

		while (num != 0) {
			num --;
			files[count++] = input.nextLine();
		}

		int [] isSame = new int [files[0].length()];

		for (int i = 0; i < files[0].length(); i++) 
			for (int j = 0; j < files.length-1; j++) 
				if (files[j].charAt(i) != files[j+1].charAt(i)) {
					isSame[i] = 1;
					break;
				}

		for (int i = 0; i < isSame.length; i++) {
			if (isSame[i] == 0) 
				System.out.print(files[0].charAt(i));
			else if (isSame[i] == 1) 
				System.out.print("?");
		}
		input.close();
	}

}
