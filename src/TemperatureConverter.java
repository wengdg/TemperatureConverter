import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Weng on 2/2/2015.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double celsius = 0, fahrenheit = 0;

      try {
        System.out.print("Enter current temp type: ");
        String tempType = scan.nextLine();

        System.out.print("Enter temperature value to convert: ");
        int tempNum = scan.nextInt();


        if (tempType.equals("-C")) {
          fahrenheit = (tempNum * 9 / 5) + 32;
          System.out.printf("%d converted to fahrenheit is %f", tempNum, fahrenheit);
        }
        else if (tempType.equals("-F")) {
          celsius = (tempNum - 32) * 5 / 9;
          System.out.printf("%d converted to celsius is %f", tempNum, celsius);

        }
        else{
          System.out.println("Illegal Input");
        }
      }
      catch (InputMismatchException e) {
        System.out.println("Illegal Input");
      }


  }
}