import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
		
    	Scanner scan = new Scanner(System.in);
    	System.out.print("������� ����������� �����: ");

    	// This method reads the number provided using keyboard
    	int num = scan.nextInt();
    	scan.close();
        
    	// �heck if number is greater than 7
    	if (num > 7) {
    		System.out.println("������");
    	}
    }
}

