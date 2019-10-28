import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*Задача: ** пресмятане с дати - 1000 дни на Земята
Напишете програма, която въвежда рождена дата във формат dd-MM-yyyy и пресмята датата, на която се навършват 1000 дни 
от тази рождена дата и я отпечатва в същия формат.*/

public class Exercise_01 {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		// create a calendar
		Calendar cal = Calendar.getInstance();
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		System.out.println("Въведете дата във формат dd-MM-yyyy");
		String date = input.nextLine();
		String[] dateArr = date.split("-");

		// set the year,month and day to something else
		cal.set(Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]) - 1, Integer.parseInt(dateArr[0]));

		cal.add(Calendar.DATE, 999);
		// print the result
		System.out.println("Датата след 1000 дни ще бъде");
		System.out.printf(simpleDateFormat.format(cal.getTime()));
	}
}
