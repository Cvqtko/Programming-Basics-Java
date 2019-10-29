import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int number1 = 0;
		int number2 = 0;
		number1 = Integer.parseInt(input.nextLine());
		number2 = Integer.parseInt(input.nextLine());
		int sum = number1 + number2;
		int diff = sum;
		int maxdiff = 0;
		for (int i = 0; i < n - 1; i++) {
			number1 = Integer.parseInt(input.nextLine());
			number2 = Integer.parseInt(input.nextLine());
			sum = number1 + number2;
			if (Math.abs(diff - sum) > maxdiff) {
				maxdiff = diff - sum;
			}
			diff = sum;
		}
		if (maxdiff == 0) {
			System.out.println("Yes, value=" + sum);
		} else {
			System.out.println("No, maxdiff=" + Math.abs(maxdiff));
		}
	}
}
