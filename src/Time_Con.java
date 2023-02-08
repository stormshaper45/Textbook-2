/**
 * title:Itec 2140
 * date:02/05/2023
 * author: Joshua Wilson
 * description: This program will calculate the time in seconds to hours and minutes using the users input
 **/
import java.util.Scanner;

public class Time_Con {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your seconds        ");

        int s = reader.nextInt();
        int hour = s % (24 *3600) / 3600;
        int second = s % 60;
        s = s % 3600;
        int min = s / 60;
        System.out.format(hour +":" + min + ":" + ":" + second);
        System.out.format(" Or " + hour + " hours " +  min + " minutes " +  second + " seconds ");


    }
}
