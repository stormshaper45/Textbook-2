/**
 * title:Itec 2140
 * date:02/05/2023
 * author: Joshua Wilson
 * description: This program will calculate the base area volume of a cylinder using the users input
 */

import java.util.Scanner;
    public class Cylinder {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter your seconds: "); // we are setting up the input to tell the user
            int number1 = reader.nextInt();
                //this will be used to clean up our input
            System.out.print("Enter Length: ");
            int number2 = reader.nextInt();
            double volume = 3.1416 * number1 * number1 * number2; //this is our formula to calculate

            System.out.print("The base area is " + volume);
            //this line is reading the code into the console
        }
    }

