import java.util.Scanner;

/*Иван е програмист в американска компания и работи от вкъщи средно N дни в месеца,
като изкарва средно по M долара на ден. В края на годината Иван получава бонус, 
който е равен на 2.5 месечни заплати. От спечеленото през годината му се удържат
25% данъци. Напишете програма, която да пресмята колко е чистата средна печалба на Иван 
на ден в лева, тъй като той харчи изкараното в България. Приема се, че в годината има точно 365 дни. 
Курсът на долара спрямо лева ще се чете от конзолата.*/
public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int workedDays = input.nextInt();
		double moneyPerDay = input.nextDouble();
		double exchangeRate = input.nextDouble();

		System.out.printf("%.2f", workedDays * moneyPerDay * 14.5 * 0.75 * exchangeRate / 365);
	}
}
