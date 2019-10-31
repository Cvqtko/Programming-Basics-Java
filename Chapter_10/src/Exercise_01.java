import java.util.Collections;
import java.util.Scanner;

/*Задача: известия 
Да се напише програма, която прочита цяло число n и на следващите редове въвежда 
n съобщения (като за всяко съобщение се прочитат по няколко реда). Всяко съобщение започва с
messageType: success, warning или error: • Когато messageType е success да се четат operation 
+ message (всяко на отделен ред). • Когато messageType е warning да се чете само message. 
• Когато messageType е error да се четат operation + message + errorCode (всяко на отделен ред).
На конзолата да се отпечата всяко прочетено съобщение, форматирано в зави-симост от неговия messageType.
Като след заглавния ред за всяко съобщение да се отпечатат толкова на брой символа =, колкото е дълъг 
съответният заглавен ред и да се сложи по един празен ред след всяко съобщение (за по-детайлно разбиране
погледнете примерите).*/
public class Exercise_01 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int n = Integer.parseInt(input.nextLine());
		String processMessage = "";
		for (int i = 0; i < n; i++) {
			processMessage = processMessage + readAndProcessMessage();
		}
		System.out.println(processMessage);
	}

	public static String showSuccessMessage() {
		String successMessage = input.nextLine();
		successMessage = "Successfully executed " + successMessage;
		String underline = String.join("", Collections.nCopies(successMessage.length(), String.valueOf("=")));
		String cause = input.nextLine();
		return String.format("%s.\n%s\n%s.\n\n", successMessage, underline, cause);
	}

	public static String showWarningMessage() {
		String warningMessage = input.nextLine();
		warningMessage = "Warning: " + warningMessage;
		String underline = String.join("", Collections.nCopies(warningMessage.length(), String.valueOf("=")));
		return String.format("%s.\n%s\n\n", warningMessage, underline);
	}

	public static String showErrorMessage() {
		String errorMessage = input.nextLine();
		errorMessage = "Error: Failed to execute " + errorMessage;
		String underline = String.join("", Collections.nCopies(errorMessage.length(), String.valueOf("=")));
		String reason = "Reason: " + input.nextLine();
		String errorCode = "Error code: " + input.nextLine();
		return String.format("%s.\n%s\n%s.\n%s.\n\n", errorMessage, underline, reason, errorCode);

	}

	public static String readAndProcessMessage() {
		String messageType = input.nextLine();
		switch (messageType) {
		case "error":
			return showErrorMessage();
		case "warning":
			return showWarningMessage();
		case "success":
			return showSuccessMessage();
		}
		return "Something went wrong";
	}
}
