import java.util.Scanner;

/*Първата задача от тази тема е следната: да се напише конзолна програма, 
която въвежда цяло число a и пресмята лицето на квадрат със страна a.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Въведете страна на квадрат - ");
		double n = Double.parseDouble(console.nextLine());
		double area = n * n;
		System.out.printf("Лицето на квадратът е %.2f", area);
	}
}
