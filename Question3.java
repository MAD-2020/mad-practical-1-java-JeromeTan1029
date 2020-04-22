import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    boolean validation;

    validation = false;
    do {
      System.out.print("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      if (input.hasNextInt()){
        int integer = input.nextInt();
        System.out.println("Output: " + (integer * integer));
        validation = true;
      }
      else{
        System.out.println("Invalid Input");
      }
    }
    while (validation == false);
    
  }
}
