import java.util.Arrays;

public class Demo3 {
	
    public static void main(String[] args) {

		int[] myArray = new int[12];  // declare and initialize an array
      
		// define the range [1..100]
        int max = 100; 
        int min = 1; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 100 
        for (int i = 0; i < myArray.length; i++) { 
            myArray[i] = (int)(Math.random() * range) + min; 
			// System.out.println(myArray[i]);
		}
		// define an element with number divisible by 3 and print it	 
		for(int i = 0; i < myArray.length; i++){
			if( myArray[i] % 3 == 0) {
			System.out.println(myArray[i]);
			}
		}
 
    }
}

// 3.	Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
