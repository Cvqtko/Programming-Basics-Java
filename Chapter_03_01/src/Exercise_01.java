import java.util.Scanner;

/*Да се напише програма, която превръща число в диапазона [0 … 100] в текст.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		int firstDigit = num / 10;
		int secondDigit = num % 10;

		String firstDigitStr = "";
		String secondDigitStr = "";
		if (num == 0) {
			System.out.println("zero");
		} else if (num == 1) {
			System.out.println("one");
		} else if (num == 2) {
			System.out.println("two");
		} else if (num == 3) {
			System.out.println("three");
		} else if (num == 4) {
			System.out.println("four");
		} else if (num == 5) {
			System.out.println("five");
		} else if (num == 6) {
			System.out.println("six");
		} else if (num == 7) {
			System.out.println("seven");
		} else if (num == 8) {
			System.out.println("eight");
		} else if (num == 9) {
			System.out.println("nine");
		} else if (num == 10) {
			System.out.println("ten");
		} else if (num == 11) {
			System.out.println("eleven");
		} else if (num == 12) {
			System.out.println("twelve");
		} else if (num == 13) {
			System.out.println("thirteen");
		} else if (num == 14) {
			System.out.println("fourteen");
		} else if (num == 15) {
			System.out.println("fifteen");
		} else if (num == 16) {
			System.out.println("sixteen");
		} else if (num == 17) {
			System.out.println("seventeen");
		} else if (num == 18) {
			System.out.println("eighteen");
		} else if (num == 19) {
			System.out.println("nineteen");
		}

		if (firstDigit == 2) {
			firstDigitStr = "twenty";
		} else if (firstDigit == 3) {
			firstDigitStr = "thirty";
		} else if (firstDigit == 4) {
			firstDigitStr = "forty";
		} else if (firstDigit == 5) {
			firstDigitStr = "fifty";
		} else if (firstDigit == 6) {
			firstDigitStr = "sixty";
		} else if (firstDigit == 7) {
			firstDigitStr = "seventy";
		} else if (firstDigit == 8) {
			firstDigitStr = "eighty";
		} else if (firstDigit == 9) {
			firstDigitStr = "ninety";
		}

		if (secondDigit == 1) {
			secondDigitStr = "one";
		} else if (secondDigit == 2) {
			secondDigitStr = "two";
		} else if (secondDigit == 3) {
			secondDigitStr = "three";
		} else if (secondDigit == 4) {
			secondDigitStr = "four";
		} else if (secondDigit == 5) {
			secondDigitStr = "five";
		} else if (secondDigit == 6) {
			secondDigitStr = "six";
		} else if (secondDigit == 7) {
			secondDigitStr = "seven";
		} else if (secondDigit == 8) {
			secondDigitStr = "eight";
		} else if (secondDigit == 9) {
			secondDigitStr = "nine";
		}

		if (num > 20 && num < 100 && secondDigit != 0) {
			System.out.println(firstDigitStr + " " + secondDigitStr);
		}

		if (secondDigit == 0 && num != 100 && firstDigit != 0 && firstDigit != 1) {
			System.out.println(firstDigitStr);
		}

		if (num == 100) {
			System.out.println("one hundred");
		}
	}
}
