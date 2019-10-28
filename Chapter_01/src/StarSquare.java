import java.util.Scanner;

/*Да се напише Java конзолна програма, която прочита от конзолата цяло положително 
число n(2 ≤ n ≤100) и отпечатва на конзолата квадрат от n звездички, като в примерите по-долу.*/
public class StarSquare {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = Integer.parseInt(console.nextLine());
		String star = "*";
		String stars = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > 0 && i < n - 1) {
					if (j > 0 && j < n - 1) {
						star = " ";
					}
				}
				stars = stars.concat(star);
				star = "*";
			}
			System.out.println(stars);
			star = "*";
			stars = "";
		}
	}
}
