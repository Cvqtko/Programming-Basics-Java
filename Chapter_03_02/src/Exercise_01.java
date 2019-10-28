import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int projectHours = input.nextInt();
		int availableDays = input.nextInt();
		int workers = input.nextInt();

		double workingDays = availableDays * 0.9;

		double totalHours = Math.floor(workingDays * workers * 10 - projectHours);

		if (totalHours > 0) {
			System.out.printf("Yes!%.0f hours left.", totalHours);
		} else {
			System.out.printf("Not enough time!%.0f hours needed.", totalHours);
		}
	}
}
