/*�� �� �������� � ��������� ������������ �� 10 x 10 ���������.*/
public class Exercise_01 {
	public static void main(String[] args) {
		String symbol = "*";
		for (int i = 0; i < 10; i++) {
			System.out.println(generateForm(10, symbol));
		}
	}

	public static String generateForm(int i, String symbol) {
		StringBuffer builder = new StringBuffer();
		for (int j = 0; j < 10; j++) {
			builder.append(symbol);

		}
		return builder.toString();
	}
}
