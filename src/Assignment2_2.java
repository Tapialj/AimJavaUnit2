import java.util.*;

public class Assignment2_2
{
    
    public static void main(String[] args) throws Exception 
    {
        int year = 0,
            month = 0,
            days = 0;
        String  monthName = "",
                numberCheck;
        boolean isNumber = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Given a year and a month in that year, this program will tell you the number of days in that month.");

        do
        {
            System.out.println("Enter a year: ");

            numberCheck = input.next();

            isNumber = checkIfInt(numberCheck);

            if(isNumber)
            {
                year = Integer.parseInt(numberCheck);
            }
            else
            {
                System.out.println("You did not enter a number. Please enter a number.");
            }
        }while(!isNumber);

        do
        {
            System.out.println("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");

            numberCheck = input.next();

            isNumber = checkIfInt(numberCheck);

            if(isNumber)
            {
                month = Integer.parseInt(numberCheck);
            }
            else
            {
                System.out.println("You did not enter a number. Please enter a number.");
            }
        }while(!isNumber);
        
        switch(month)
        {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                {
                    days = 29;
                }
                else
                {
                    days = 28;
                }
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default: 
                System.out.println(month + " is invalid. Month values must be between 1 and 12, inclusive.\nGoodbye ...");
                System.exit(0);
                break;
        }
        
        System.out.println(monthName + " of " + year + " has " + days + " days in it.\nGoodbye ...");

        input.close();
        System.exit(0);

    }

    public static boolean checkIfInt(String check)
	{
		if(check == null)
			return false;
					
		try
		{
			int i = Integer.parseInt(check);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		
		return true;
	}

}