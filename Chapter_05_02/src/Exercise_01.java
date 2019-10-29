import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		double divisibleBy2 = 0;
		double divisibleBy3 = 0;
		double divisibleBy4 = 0;
		int counter = 0;
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(input.nextLine());
			counter++;
			if (number % 2 == 0)
				divisibleBy2++;
			if (number % 3 == 0)
				divisibleBy3++;
			if (number % 4 == 0)
				divisibleBy4++;
		}
		System.out.printf("%.2f%% \n%.2f%%\n%.2f%%", divisibleBy2 * 100 / counter, divisibleBy3 * 100 / counter,
				divisibleBy4 * 100 / counter);
	}
}
