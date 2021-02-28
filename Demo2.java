import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		String strPattern = new String("Вячеслав");
				
		Scanner scan = new Scanner(System.in);
		//Get input String
		System.out.println("Пожалуйста, введите имя: ");
		// This method reads the String provided using keyboard
		String str = scan.nextLine();

        // Closing Scanner after the use
        scan.close();

        // checks if number is greater than 7
        if(strPattern.equals(str)) {
        	System.out.println("Привет, Вячеслав");
        }
        else {
        	System.out.println("Нет такого имени");
        }
	}
}

