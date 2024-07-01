public class RangeOfANumber {

	public static int range (int[] numbers){

		
		int maximum = numbers[0];
		for (int num : numbers) {
			if (num > maximum ){
				maximum = num;
		}
			}
		int minimum = numbers[0];
		for (int nums : numbers ){
			if ( nums < minimum){
				minimum = nums;
		}
		} 
		return maximum - minimum;
	}



}