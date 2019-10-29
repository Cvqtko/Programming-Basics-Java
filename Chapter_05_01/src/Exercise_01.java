import java.util.Scanner;
/*Задача: еднакви двойки
Дадени са 2 * n числа. Първото и второто формират двойка, третото и четвъртото също и т.н.
Всяка двойка има стойност – сумата от съставящите я числа. Напи-шете програма,
която проверява дали всички двойки имат еднаква стойност.
В случай, че е еднаква отпечатайте "Yes, value=…" + стойността, в противен случай 
отпечатайте максималната разлика между две последователни двойки в следния формат
- "No, maxdiff=…" + максималната разлика.
Входът се състои от число n, следвано от 2*n цели числа, всички по едно на ред.*/
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
