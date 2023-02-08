/**
 * title:Itec 2140
 * date:02/05/2023
 * author: Joshua Wilson
 * description: This program will calculate the price and the gallons needed to paint a room using user input and assumed information
 */

import java.util.Scanner;

public class Gallons {
    public static void main(String[] args) {
        double length, width, height;   // these are important factors in our equation
        int paint_square = 350;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");    //these lines are to let the user know which value they are setting
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();

        double area = computeArea(length, width, height);
        double price =  computeGallons(area);
        /**
         * we are using the following formula above to calculate the input given
         * the goal is to try to make the console understandable and not to cluttered
         */

        //System.out.println(area);


        System.out.println("The price to paint the room is "+price);
    }
    public static double computeArea(double length, double width, double height){

        double area = width * height;
        System.out.println("Wall of the are: "+area);
        return area;

    }

    private static double computeGallons(double area) {

        double gallons_need = area/100;
        System.out.println("You will need: "+gallons_need+" gallons");
        double  price =  gallons_need * 32;
        return price;   // we are getting the variable back
    }

}