import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

    	int[] myArray = { 15, 8, 21, 36, 89 };  // declare and initialize an array

    	// define an element with number divisible by 3 and print it	 
    	for(int i = 0; i < myArray.length; i++){
    		if( myArray[i] % 3 == 0) {
    			System.out.println(myArray[i]);
			}
		}
    }
}

