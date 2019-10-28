import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*Хотел предлага два вида стаи: студио и апартамент.
Напишете програма, която изчислява цената за целия престой за студио и апартамент. 
Цените зависят от месеца на престоя: Май и октомври Юни и септември Юли и август Студио – 50 лв.
/нощувка Студио – 75.20 лв./нощувка Студио – 76 лв./нощувка Апартамент – 65 лв./нощувка Апартамент – 68.70 лв.
 * /нощувка Апартамент – 77 лв./нощувка
Предлагат се и следните отстъпки:
• За студио, при повече от 7 нощувки през май и октомври: 5% намаление.
• За студио, при повече от 14 нощувки през май и октомври: 30% намаление.
• За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
• За апартамент, при повече от 14 нощувки, без значение от месеца: 10% намаление.
192 Основи на програмирането с Java
Входни данни
Входът се чете от конзолата и съдържа точно два реда:
• На първия ред е месецът – May, June, July, August, September или October.
• На втория ред е броят на нощувките – цяло число в интервала [0 … 200].
Изходни данни
Да се отпечатат на конзолата два реда:
• На първия ред: "Apartment: { цена за целият престой } lv."
• На втория ред: "Studio: { цена за целият престой } lv."*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month = input.nextLine();
		int nights = Integer.parseInt(input.nextLine());
		BigDecimal studioPrice = new BigDecimal(0);
		BigDecimal apartmentPrice = new BigDecimal(0);
		BigDecimal studioRent = new BigDecimal(0);
		BigDecimal apartmentRent = new BigDecimal(0);

		switch (month) {
		case "May":
		case "October":
			studioPrice = new BigDecimal(50);
			apartmentPrice = new BigDecimal(65);

			studioRent = studioPrice.multiply(new BigDecimal(nights));
			apartmentRent = apartmentPrice.multiply(new BigDecimal(nights));
			if (nights > 14) {
				studioRent = studioRent.multiply(new BigDecimal(0.7));
				apartmentRent = apartmentRent.multiply(new BigDecimal(0.9));
			} else if (nights > 7) {
				studioRent = studioRent.multiply(new BigDecimal(0.95));
			}
			break;
		case "June":
		case "September":
			studioPrice = new BigDecimal(75.2);
			apartmentPrice = new BigDecimal(68.70);

			studioRent = studioPrice.multiply(new BigDecimal(nights));
			apartmentRent = apartmentPrice.multiply(new BigDecimal(nights));
			if (nights > 14) {
				studioRent = studioRent.multiply(new BigDecimal(0.8));
				apartmentRent = apartmentRent.multiply(new BigDecimal(0.9));
			}
			break;
		case "July":
		case "August":
			studioPrice = new BigDecimal(76);
			apartmentPrice = new BigDecimal(77);

			studioRent = studioPrice.multiply(new BigDecimal(nights));
			apartmentRent = apartmentPrice.multiply(new BigDecimal(nights));
			if (nights > 14) {
				apartmentRent = apartmentRent.multiply(new BigDecimal(0.9));
			}
			break;
		default:
			break;
		}
		DecimalFormat decimalFormatter = new DecimalFormat("0.00");
		String studioInfo = String.format("Studio: %s lv",
				decimalFormatter.format(studioRent.setScale(2, BigDecimal.ROUND_HALF_UP)));
		String apartmentInfo = String.format("Apartment: %s lv",
				decimalFormatter.format(apartmentRent.setScale(2, BigDecimal.ROUND_HALF_UP)));
		System.out.println(apartmentInfo + "\n" + studioInfo);
	}
}
