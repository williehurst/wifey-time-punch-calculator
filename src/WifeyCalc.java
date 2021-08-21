import java.util.AbstractMap;
import java.util.Scanner;

//This the main class.
public class WifeyCalc {

    /*Constructor for main class.
    public WifeyCalc() {

    }*/

    //This method will be used to check if user input is a number
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args){

        //variables to store user's time input
        int hour=0, min=0;
        String amPM="AM"; //To be used for AM or PM time entry.
        String input; // User input buffer
        boolean flag = true; // This flag is to end correct-input validation.
        boolean doneEnteringTime = false; // This flag is to end time entry loop.
        int timePunchCounter = 1;
        Time startTime = new Time(hour,min,amPM);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello beautiful. ");

        // Ask user if they would like to enter time entry
        do {
            System.out.print("Would you like to enter a time punch for calculation?: ");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("yes") {
                flag = false;
            }
            else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("no")) {
                System.exit();
            }
            else {
                System.out.print("Please enter Yes or No: ");
                input = keyboard.nextLine();
            }

        }
        while (flag == true);
        flag = true; //reset flag.


        do {
            //Get input from user about hours
            System.out.print("\nAt what hour did you clock in:");
            input = keyboard.nextLine();

            do {
                if (isNumeric(input)) {
                    if (Integer.valueOf(input) <= 12 && Integer.valueOf(input) >= 1) {
                        hour = Integer.valueOf(input);
                        flag = false;
                    } else {
                        System.out.print("Please enter a hour between 1-12: ");
                        input = keyboard.nextLine();
                    }
                } else {
                    System.out.print("Please enter a hour between 1-12: ");
                    input = keyboard.nextLine();
                }
            }
            while (flag == true);
            flag = true; //Reset isNumeric flag

            //Get input from user about minutes
            System.out.print("and what minute on the hour did you clock in?:");
            input = keyboard.nextLine();

            do {
                if (isNumeric(input)) {
                    if (Integer.valueOf(input) <= 59 && Integer.valueOf(input) >= 0) {
                        min = Integer.valueOf(input);
                        flag = false;
                    } else {
                        System.out.print("Please enter valid minutes between 0-59: ");
                        input = keyboard.nextLine();
                    }
                } else {
                    System.out.print("Please enter valid minutes between 0-59: ");
                    input = keyboard.nextLine();
                }
            }
            while (flag == true);
            flag = true;

            //Get input from user about minutes
            System.out.print("and was it AM or PM?:");
            input = keyboard.nextLine();
            do {
                if (input.equalsIgnoreCase("AM") || input.equalsIgnoreCase("PM")) {
                    amPM = input.toUpperCase();
                    flag = false;
                } else {
                    System.out.print("Please enter AM or PM: ");
                    input = keyboard.nextLine();
                }
            }
            while (flag == true);
            flag = false;
            startTime.setHour(hour);
            startTime.setMin(min);
            startTime.setAmOrPm(amPM);

            timePunchCounter++; // Progress time entry counter by 1.

            // Check if user wants to enter another time punch.
            do {
                System.out.print("Would you like to enter another time punch for calculation?: ");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("yes") {
                    flag = false;
                }
            else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("no")) {
                    System.out.println("You need to clock out at"+(hour));
                }
                else {
                    System.out.print("Please enter Yes or No: ");
                    input = keyboard.nextLine();
                }

        }
        while (!doneEnteringTime);







//////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(startTime.getHour());
        System.out.println(startTime.getMin());
        System.out.println(startTime.getAmOrPM());
        System.out.println(startTime.toString());

        keyboard.close();
    }
}
