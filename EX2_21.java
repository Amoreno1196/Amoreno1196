
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class EX2_21 {
public static void main(String args[]) {
double investment_amount,monthly_interest_rate,annual_interest_rate,future_investment_value;
int no_of_years;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the investment amount:");
investment_amount=sc.nextDouble();//reading the investment amount
System.out.println(investment_amount);
System.out.print("Enter the annual interest rate:");
annual_interest_rate=sc.nextDouble();//reading the annual rate of interest
System.out.println(annual_interest_rate);
System.out.print("Enter the number of years:");
no_of_years=sc.nextInt();//reading the no of years
System.out.println(no_of_years);
monthly_interest_rate=(annual_interest_rate/100)/12;//finding the monthly interest rate
//System.out.println(monthly_interest_rate);
future_investment_value=(investment_amount)*Math.pow((1+monthly_interest_rate),(no_of_years*12));
System.out.print("Accumulated value: ");//finding the future investment value
System.out.println(future_investment_value);
}
