package assignment3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DayOfBirth {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String month;
        String day;
        String year;
        DayOfBirth assignment3 = new DayOfBirth();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the month you were born: "); // User input for month of birth
        month = scanner.nextLine();
        System.out.println("Please input the day you were born: "); // User input for day of birth
        day = scanner.nextLine();
        System.out.println("Please input the year you were born: ");  // User input for month of birth
        year = scanner.nextLine();

        String date = month + "/" + day + "/" + year; // Concatenate date of birth

        System.out.println("You were born on a " + assignment3.dayOfWeek(date));
    }
    String dayOfWeek(String date)
    {
        String day = null;
        Date DATE = null;
        try
        {

            DATE = new java.text.SimpleDateFormat("MM/dd/yyyy").parse(date); // Convert the date string to date object
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE"); // Format to get the full day name
            day = simpleDateFormat.format(DATE).toUpperCase(); // Assign the day from user inputted date and standardize all the results for testing
        }
        catch(ParseException e)
        {
            return "Invalid Date";
        }
        return day;
    }
}
