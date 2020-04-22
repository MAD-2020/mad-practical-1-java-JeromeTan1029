import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    boolean validation;

    validation = false;
    do {
      System.out.print("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      if (input.hasNextInt()){
        int integer = input.nextInt();
        for (int i = integer ; i > 0 ; i--){
          for (int u = i ; u > 0 ; u--){
            System.out.print("*");
          }
          System.out.println();
        }
        validation = true;
      }
      else{
        System.out.println("Invalid Input");
      }
    }
    while (validation == false);
    
  }
}
