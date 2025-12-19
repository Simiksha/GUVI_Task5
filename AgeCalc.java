package GUVI_Task5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //getting dob from user
        System.out.print("Enter your birthday (yyyy-mm-dd): ");
        String userInput = s.nextLine();

        // date time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //parsing user input to locat Date formatter
        LocalDate dob = LocalDate.parse(userInput, formatter);

        //getting Local date
        LocalDate currentDate = LocalDate.now();

        //Finding the period between dob and current date
        Period age = Period.between(dob, currentDate);

        //Printing age
        System.out.println("Your age is: " + age.getYears()+ " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
        s.close();
    }
    
}
