import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    boolean validation;
    int numbers = 0;
    HashMap<Integer, Integer> occurrence = new HashMap<Integer, Integer>();

    validation = false;
    do {
      System.out.print("Enter in numbers to enter: ");
      Scanner numbersInput = new Scanner(System.in);
      if (numbersInput.hasNextInt()){
        numbers = numbersInput.nextInt();
        validation = true;
      }
      else{
        System.out.println("Invalid Input");
      }
    }
    while (validation == false);

    for (int i = 0 ; i < numbers ; i++){
      validation = false;
      do {
        System.out.print("Enter number " + (i + 1) + ": ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()){
          int integer = input.nextInt();
          if (!(occurrence.containsKey(integer))){
            occurrence.put(integer, 1);
          }
          else{
            occurrence.replace(integer, occurrence.get(integer) + 1);
          }
          validation = true;
        }
        else{
          System.out.println("Invalid Input");
        }
      }
      while (validation == false);
    }

    int highestOccurrence = 0;
    for (int i : occurrence.values()){
      if (i > highestOccurrence){
        highestOccurrence = i;
      }
    }
    
    System.out.print("Mode(s): ");
    for (int key : occurrence.keySet()){
      if (occurrence.get(key) == highestOccurrence){
        System.out.print(key + " ");
      }
    }
    
  }
}
