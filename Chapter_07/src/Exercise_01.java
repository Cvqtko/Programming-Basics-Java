import java.util.Scanner;

/*Задача Справяне с грешни числа чрез try-catch
Да се напише програма, която проверява дали едно число n е четно и ако е, да се отпечатва на екрана.
При невалидно въведено число да се изписва съобщение, че въведения вход не е валидно число и въвеждането
да продължи отново.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		while (true) {
			try {
				System.out.println("Enter even number: ");
				n = Integer.parseInt(input.nextLine());
				if (n % 2 == 0) {
					System.out.printf("Even number entered: %d.", n);
					break;
				}
				System.out.println("The number you entered is not even");
			} catch (Exception ex) {
				System.out.println("Invalid number!");
			}

		}
	}
}
