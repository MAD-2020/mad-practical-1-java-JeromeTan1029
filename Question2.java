import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    double weight = 0;
    double height = 0;
    boolean validation;

    validation = false;
    do {
      System.out.print("Enter your height (m): ");
      Scanner heightInput = new Scanner(System.in);
      if (heightInput.hasNextDouble()){
        height = heightInput.nextDouble();
        validation = true;
      }
      else{
        System.out.println("Invalid Input");
      }
    }
    while (validation == false);


    validation = false;
    do {
      System.out.print("Enter your weight (kg): ");
      Scanner weightInput = new Scanner(System.in);
      if (weightInput.hasNextDouble()){
         weight = weightInput.nextDouble();
         validation = true;
      }
      else{
        System.out.println("Invalid Input");
      }
    }
    while (validation == false);
    
    double bmi = weight / (height * height);
    System.out.println("Your BMI is: " + bmi);
  }
}
