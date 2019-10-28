import java.util.Scanner;

/*Фирма получава заявка за изработването на проект, за който са необходими опре-делен брой часове. Фирмата разполага с определен брой дни. През 10% от дните служителите са на обучение и не могат да работят по проекта. Един нормален работен ден във фирмата е 8 часа. Проектът е важен за фирмата и всеки служител задължително работи по проекта в извънработно време по 2 часа на ден.
Часовете трябва да са закръглени към по-ниско цяло число (например → 6.98 часа се закръглят на 6 часа).
Напишете програма, която изчислява дали фирмата може да завърши проекта навреме и колко часа не достигат или остават.
Входни данни
Входът се чете от конзолата и съдържа точно 3 реда:
• На първия ред са необходимите часове – цяло число в интервала [0 … 200 000].
• На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 … 20 000].
• На третия ред е броят на всички служители – цяло число в интервала [0 … 200].
Изходни данни
Да се отпечата на конзолата един ред:
• Ако времето е достатъчно:
o "Yes!{оставащите часове} hours left.".
• Ако времето НЕ Е достатъчно:
o "Not enough time!{недостигащите часове} hours needed.".*/
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