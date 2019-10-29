import java.util.Scanner;
/*Задача: деление без остатък
Дадени са n цели числа в интервала [1 … 1000]. От тях някакъв процент p1 се делят без остатък на 2,
процент p2 се делят без остатък на 3, процент p3 се делят без остатък на 4. Да се напише програма, 
която изчислява и отпечатва процентите p1, p2 и p3. Пример: имаме n = 10 числа: 680, 2, 600, 200,
800, 799, 199, 46, 128, 65. Получаваме следното разпределение и визуализация:
	Вход          Изход
	10			  70.00%
	680			  10.00%
	2			  50.00%
	600
	200
	800 
	799 
	199 
	46
	128
	65 */
	  
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
