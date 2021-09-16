import java.util.*;

public class Assignment2_1 
{
    
    public static void main(String[] args) throws Exception 
    {
        double  celsius = 0,
                fahrenheit;
        String  doubleCheck;
        boolean isNumber = false;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit. Enter a temperature in degrees Celsius: ");

            doubleCheck = input.next();

            isNumber = checkIfDouble(doubleCheck);

            if(isNumber)
            {
                celsius = Double.parseDouble(doubleCheck);
            }
            else
            {
                System.out.println("You did not enter a number. Please enter a valid number.");
            }
        }while(!isNumber);
        
        fahrenheit = ((9.0 / 5.0) * celsius) + 32;

        System.out.printf("\n%.2f degrees Celsius is equa4l to %.2f degrees Fahrenheit.", celsius, fahrenheit);

        System.out.println("\n\nGoodbye...");

        input.close();
        System.exit(0);
    }

    public static boolean checkIfDouble(String check)
	{
		if(check == null)
			return false;
					
		try
		{
			double i = Double.parseDouble(check);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		
		return true;
	}

}