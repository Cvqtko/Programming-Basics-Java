import java.util.Scanner;

/*������� ������ �� ���� ���� � ��������: �� �� ������ �������� ��������, 
����� ������� ���� ����� a � �������� ������ �� ������� ��� ������ a.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("�������� ������ �� ������� - ");
		double n = Double.parseDouble(console.nextLine());
		double area = n * n;
		System.out.printf("������ �� ��������� � %.2f", area);
	}
}
