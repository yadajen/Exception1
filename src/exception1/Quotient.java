package exception1;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try{
            System.out.println(number1+"/"+number2+"is"+(number1/number2));
        }
        catch(ArithmeticException ex){
            System.out.println("Exception: Divisor cannot be zero");
        }
        }
    }