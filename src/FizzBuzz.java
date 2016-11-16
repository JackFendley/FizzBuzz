/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int userNum = 1;
           int fizz = 3;
           int fizzBuzz = 15;
           int buzz = 5;

           while(userNum<101){
        	   if(userNum%fizzBuzz==0)System.out.println("Fizz Buzz");
        	   else if(userNum%buzz==0)System.out.println("Buzz");
        	   else if(userNum%fizz==0)System.out.println("Fizz");
        	   else System.out.println(userNum);
        	   		userNum++;
           }
	}

}
