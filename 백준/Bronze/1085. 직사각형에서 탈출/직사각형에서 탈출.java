import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		String [] ip = (input.nextLine()).split(" ");
		
		int hansu_x = Integer.parseInt(ip[0]);
		int hansu_y = Integer.parseInt(ip[1]);
		int r_w = Integer.parseInt(ip[2]);
		int r_h = Integer.parseInt(ip[3]);
		
		int [] choose = new int [4];
		
		choose[0] = hansu_x - 0;
		choose[1] = hansu_y - 0;
		choose[2] = r_w - hansu_x;
		choose[3] = r_h - hansu_y;
		
		int min = choose[0];
		
		for (int i = 1; i < choose.length; i++) {
			if (min > choose[i])
				min = choose[i];
		}
		
		System.out.println(min);
        
        input.close();

	}

}
