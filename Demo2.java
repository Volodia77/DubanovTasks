import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

		/* 
		String encoding = System.getProperty("console.encoding", "utf-8");
		Scanner sc = new Scanner(System.in, encoding);
		System.out.println("encoding is: "+sc);
		*/
		
		
		Scanner sc = new Scanner(System.in, "UTF-8");
		
		String strPattern = new String("¬€чеслав");
				
		Scanner scan = new Scanner(System.in,"utf-8");
		System.setProperty("console.encoding","utf-8");
		
		//Get input String
		System.out.println("Please, enter First Name: ");
		
		// asdertyJuihlJ
		
         		
        // This method reads the String provided using keyboard
        String str = scan.nextLine();

        // Closing Scanner after the use
        scan.close();
        
        // Displaying the String
        System.out.println("Input String is: "+str);
		
		 // checks if number is greater than 7
		
		if(strPattern.equals(str)) {
            System.out.println("ѕривет, ¬€чеслав");
		}
        else {
            System.out.println("Ќет такого имени");
		}
		
				
		
    }
}

// 2.	—оставить алгоритм: если введенное им€ совпадает с ¬€чеслав, то вывести Уѕривет, ¬€чеславФ, если нет, то вывести "Ќет такого имени"


