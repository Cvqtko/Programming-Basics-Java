import java.util.Scanner;

/*Градинар продава реколтата от градината си на зеленчуковата борса. 
Продава зеленчуци за N лева на килограм и плодове за M лева за килограм.
Напишете програма, която да пресмята приходите от реколтата в евро (ако приемем, че едно евро е равно на 1.94 лв.).*/

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double vegetablePrice = input.nextDouble();
		double fruitPrice = input.nextDouble();
		double vegetableKilos = input.nextDouble();
		double fruitKilos = input.nextDouble();
		System.out.println((vegetableKilos * vegetablePrice + fruitKilos * fruitPrice) / 1.94);
	}
}
