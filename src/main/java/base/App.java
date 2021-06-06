/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

/*
Exercise 6 - Retirement Calculator
Your computer knows what the current year is, which means you can incorporate that into your programs.
You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire.
It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.

Challenge
Handle situations where the program returns a negative number by stating that the user can already retire.
 */

public class App {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int convertAge, convertRetireAge, yearsLeft, currentYear;

        System.out.print("What is your current age? ");
        String age = in.next();
        convertAge = Integer.parseInt(age);

        System.out.print("At what age would you like to retire? ");
        String retireAge = in.next();
        convertRetireAge = Integer.parseInt(retireAge);

        // Years left until need to retire
        yearsLeft = convertRetireAge - convertAge;

        // Current Year
        int thisYear = YearMonth.now().getYear();

        String outputStringYearsLeft = "You have " + yearsLeft + " years left until you can retire.";
        System.out.println(outputStringYearsLeft);

        String whatYear = "It's " + thisYear + ", so you can retire in " + (thisYear + yearsLeft);
        System.out.println(whatYear);
    }
}
