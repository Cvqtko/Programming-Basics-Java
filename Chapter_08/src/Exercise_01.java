import java.util.Scanner;

/*�������� ��������, ����� �� �������� �� ��������� ������ ���������� �� 
3 ����� � ������� ��������, ���� �� ��������� ������������, ��������� �������� 
�� ��������� �����. ������ ������ �� �� �������� ����� ���������� ����������.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char startLetter = input.next().charAt(0);
		char endLetter = input.next().charAt(0);
		char forbiddenLetter = input.next().charAt(0);
		int counter = 0;
		for (char i = startLetter; i <= endLetter; i++) {
			if (i == forbiddenLetter)
				continue;
			for (char j = startLetter; j <= endLetter; j++) {
				if (j == forbiddenLetter)
					continue;
				for (char k = startLetter; k <= endLetter; k++) {
					if (k == forbiddenLetter)
						continue;
					System.out.print("" + i + j + k + " ");
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
