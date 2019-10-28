import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*������: ** ���������� � ���� - 1000 ��� �� ������
�������� ��������, ����� ������� ������� ���� ��� ������ dd-MM-yyyy � �������� ������, �� ����� �� ��������� 1000 ��� 
�� ���� ������� ���� � � ��������� � ����� ������.*/

public class Exercise_02 {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		// create a calendar
		Calendar cal = Calendar.getInstance();
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		System.out.println("�������� ���� ��� ������ dd-MM-yyyy");
		String date = input.nextLine();
		String[] dateArr = date.split("-");

		// set the year,month and day to something else
		cal.set(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]) - 1, Integer.parseInt(dateArr[0]));

		cal.add(Calendar.DATE, 999);
		// print the result
		System.out.println("������ ���� 1000 ��� �� ����");
		System.out.printf(simpleDateFormat.format(cal.getTime()));
	}
}
