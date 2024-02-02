package lection4;

import java.util.Scanner;

public class excersise1 {
    public static void main(String[] args) {

            Scanner whichday = new Scanner(System.in);
            System.out.println("Enter the number of the day:");
            String dayOfWeek = whichday.nextLine();
            int userDigit = whichday.nextInt();
        switch(userDigit)
            {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                case 7:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "Please enter a valid input";
                    break;



            }
        System.out.println("The day of the week is:" + dayOfWeek);
        }
    }
