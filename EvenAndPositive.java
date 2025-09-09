/*
 * McGill - Programing 1 - TP 1
 * By Sebastien Lapratte
 * 
 * Write a program EvenAndPositive that
 * takes an integer as input and displays on your screen 
 * whether it is true or false that such integer is even, positive, or both.
 * 
 */
public class EvenAndPositive {
  public static void main(String[] args) {

    String rawInput = null;

    if (args.length == 0) {
      // If no number past has argument prompt for it
      rawInput = System.console().readLine("Enter an Number : ");
    } else {
      rawInput = args[0];
    }

    Integer numberValue = Integer.parseInt(rawInput);
    boolean isEvenNumber = (numberValue % 2) == 0;
    boolean isPositiveNumber = numberValue > 0;

    // 7 is an even number: false
    System.out.println(String.format("%d is an even number: %b", numberValue, isEvenNumber));

    // 7 is a positive number: true
    System.out.println(String.format("%d is an positive number: %b", numberValue, numberValue > 0));

    // 7 is a positive even number: false
    System.out.println(String.format("%d is an  positive even number: %b12", numberValue, (isEvenNumber && isPositiveNumber)));

  }
}
