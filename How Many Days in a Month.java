/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
            System.out.print("Enter a year: ");
        int year = input.nextInt();
            System.out.print("Enter a month Abv (Jan,Feb,Mar,ect.): ");
            String month = input.next();
        boolean leapYear = 
            ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
            System.out.print(month + " " + year + " has ");
        if ( month.equals("Jan") || month.equals("Mar") || 
	     month.equals("May") || month.equals("Jul") ||
	     month.equals("Aug") || month.equals("Oct") ||
	     month.equals("Dec"))
		System.out.println(31 + " days");
	else if (month.equals("Apr") || month.equals("Jun") || 
		 month.equals("Sep") || month.equals("Nov"))
		 System.out.println(30 + " days");
        else 
           
		 System.out.println(((leapYear) ? 29 : 28) + " days");	
	}
}
