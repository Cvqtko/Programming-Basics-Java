import java.util.Scanner;

/*�� �� ������ ��������, ����� ��������� ���� ���� ����� n � ����� � ��� �,
�� �� ��������� �� ������. ��� ��������� �������� ����� �� �� ������� ���������,
�� ��������� ���� �� � ������� ����� � ����������� �� �������� ������.*/
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
