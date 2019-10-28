import java.util.Scanner;

/*Учебна зала има правоъгълен размер l на w метра, без колони във вътрешността си. 
Залата е разделена на две части – лява и дясна, с коридор - приблизително по средата.
В лявата и в дясната част има редици с бюра. В задната част на залата има голяма входна врата.
В предната част на залата има катедра с подиум за преподавателя. Едно работно място заема 70 на 120 cm
(маса с размер 70 на 40 cm + място за стол и преминаване с размер 70 на 80 cm). Коридорът е широк поне
100 cm. Изчислено е, че заради входната врата (която е с отвор 160 cm) се губи точно 1 работно място, 
а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места. Напишете програма,
която въвежда размери на учебната зала и изчислява броя работни места в нея при описаното разположение (вж. фигурата).*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = input.nextDouble();
		double width = input.nextDouble();

		double area = length * width;

		int cols = (int) ((width - 1) / 0.7);
		int rows = (int) (length / 1.2);
		int seats = (rows * cols) - 3;

		System.out.println(seats);
	}
}
