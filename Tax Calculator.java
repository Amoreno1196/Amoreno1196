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

public class EX4_23 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter employee’s name: ");
            String name = input.next();	
            System.out.print("Enter number of hours worked in a week: ");
	double hoursWorked = input.nextDouble();
            System.out.print("Enter hourly pay rate: ");
	double hourlyPayRate = input.nextDouble();
            System.out.print("Enter federal tax withholdin rate: ");
	double federalTaxRate = input.nextDouble();
            System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
	double grossPay, federal, state, totalDeduction;
            System.out.println(
		"Employee Name: " + name + 
		"\tHours Worked: " + hoursWorked +
		"\tPay Rate:" + hourlyPayRate +
		"\tGross Pay:" + (grossPay = hoursWorked * hourlyPayRate) +
		"\tDeductions:\t   Federal Witholding (20.0%):" +
                   (federal = grossPay * federalTaxRate) +
// how do we get it accounting format?
		"\tState Witholding (9.0%):" + (state = grossPay * stateTaxRate) +
		"\tTotal Deduction:" + (totalDeduction = federal + state) +
		"\tNet Pay:" + (grossPay - totalDeduction)
            );
	}
}

