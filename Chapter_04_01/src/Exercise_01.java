import java.util.Scanner;
/*Задача:*точка във фигурата Фигура се състои от 6 блокчета с размер
h*h,разположени като на фигурата.Долният ляв ъгъл на сградата е на позиция{0,0}.
Горният десен ъгъл на фигурата е на позиция{2*h,4*h}.На фигурата координатите са
дадени при h=2. Да се напише програма,която въвежда цяло число h и координатите
на дадена точка{x,y}(цели числа)и отпечатва дали точката е вътре във фигурата(inside),
вън от фигурата(outside)или на някоя от стените на фигурата(border).*/

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = Integer.parseInt(input.nextLine());
		int x = Integer.parseInt(input.nextLine());
		int y = Integer.parseInt(input.nextLine());

		boolean inRectangle1 = (x > 0 && x < 3 * h) && (y > 0 && y < h);
		boolean inRectangle2 = (x > h && x < 2 * h) && (y > h && y < 4 * h);

		boolean commonBorder = (x==0 && y<h)
							||(x == 3*h && y<h)
							||(y == 0 && x<3*h)
							||(y == h && x<3*h)
							||(x==h && (y>h&&y<4*h))
							||(x == 2*h && (y>h&&y<4*h))
							||(y == 4*h && (x>h&&x<2*h));
		
		if (inRectangle1 || inRectangle2) {
			System.out.println("inside");
		} else if (commonBorder){
			System.out.println("border");
		}else {
			System.out.println("outside");
		}
	}
}
