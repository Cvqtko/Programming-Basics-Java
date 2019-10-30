import java.util.Scanner;
/*Задача: бикове и крави
Всички знаем играта „Бикове и крави“ (http://en.wikipedia.org/wiki/Bulls_and_cows).
	При дадено 4-цифрено тайно число и 4-цифрено предполагаемо число, използ-ваме следните правила:
• Ако имаме цифра от предполагаемото число, която съвпада с цифра от тайното число и е на същата позиция, имаме бик.
• Ако имаме цифра от предполагаемото число, която съвпада с цифра от тайното число, но е на различна позиция, имаме крава.
При дадено тайно число и брой на бикове и крави, нашата задача е да намерим всички възможни предполагаеми числа в нарастващ
ред.
Ако не съществуват предполагаеми числа, които да отговарят на зададените критерии на конзолата, трябва да се отпечата "No".*/

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guessNum = input.nextLine();
		int targetBulls = Integer.parseInt(input.nextLine());
		int targetCows = Integer.parseInt(input.nextLine());
		boolean hasSolution = false;
		boolean isFirst = true;

		for (int num = 1111; num <= 9999; num++) {
			int bulls = 0;
			int cows = 0;
			char[] numStr = ("" + num).toCharArray();
			boolean[] isGuessVisted = new boolean[numStr.length];
			boolean[] isNumVisted = new boolean[numStr.length];
			// added another bool array to track the digits that are visited from the number
			// we are checking

			if (!("" + num).contains("0")) {
				for (int i = 0; i < guessNum.length(); i++) // count bulls and cows
				{
					if (guessNum.charAt(i) == numStr[i]) {
						bulls++;
						isGuessVisted[i] = true; // set that we have visited this digit at index i
						isNumVisted[i] = true; // set that we have visited this digit at index i
					}
				}

				for (int i = 0; i < guessNum.length(); i++) {
					for (int j = 0; j < numStr.length; j++) {
						if (i != j && !isNumVisted[j] && !isGuessVisted[i] && guessNum.charAt(i) == numStr[j]) 
							// check if digits are the same
						{
							cows++;
							isGuessVisted[i] = true; // set that we have visited this digit at index i
							isNumVisted[j] = true; // set that we have visited this digit at index j
						}
					}
				}
				if (bulls == targetBulls && cows == targetCows) {
					hasSolution = true;
					if (!isFirst) {
						System.out.print(" ");
					}
					System.out.print(num);
					isFirst = false;
				}
			}
		}

		if (!hasSolution) {
			System.out.println("No");
		}
	}
}