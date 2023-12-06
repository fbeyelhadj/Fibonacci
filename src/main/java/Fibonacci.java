/**
 *
 * @author Fatima Beyelhadj
 * @version 1.1
 *
 *  This class calculates and display the value of Fibonacci method
 *
 */


public class Fibonacci {

    public static void main(String[] args) {
        /*
          This is the main method. It will call fibonacciRecursion method. This will
          calculate value of the recursive for n=10 * processing This will print the
          results on the console

          @param args Process the command line arguments
         */
        System.out.println("The nth term of the fibonacci sequence  is: " + fibonacciRecursion(10));
    }

    public static int fibonacciRecursion(int n) {
        /*
          This constructor use Fibonacci recursive method to calculate the value of an
          integer

          @param n integer to be processed
         * @return The result of the calculation
         */
        if (n <= 0) {
            return 0;
        }else if (n==1){
                return 1;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }

}
