import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = "";
		int count = 0;
		
		while (true) {
			String name = input.next();
			int age = input.nextInt();
			int weight = input.nextInt();
			
			if (name.equals("#") && age == 0 && weight == 0) break;
			
			if (age > 17 || weight >= 80) 
				System.out.println(name + " Senior");
			else {
				System.out.println(name + " Junior");
			}
		}
		input.close();
	}
}
