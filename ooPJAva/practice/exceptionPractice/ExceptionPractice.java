public class ExceptionPractice{
   public static void main(String...a){
	try{
		int result = divideNumber(5,2);
		System.out.print("Result: " + result);
		}catch(Hafeez e){
		System.out.println("Error " + e.getMessage());
		}
   }

public static int divideNumber(int divided, int divisor){
	if(divisor == 0){
	throw new Hafeez("Number cannot be divided by zero");
	}
		return divided/divisor;
} 
}

