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
public class EX3_1 {
    
public static void main(String[] args) {
// entered values seperately because all together didnt work
    Scanner input = new Scanner(System.in);
        System.out.print("Enter 'a': ");
	double a = input.nextDouble();
        System.out.print("Enter 'b': ");
	double b = input.nextDouble();
        System.out.print("Enter 'c': ");
	double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.print("The equation is ");
	if (discriminant > 0)
            {
                double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
                double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
                System.out.println("two roots " + root1 + " and " + root2);
            }
        else if (discriminant == 0)
            {
                double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
                System.out.println("one root " + root1);
            }else {
            System.out.println("no real roots");
	}
}
}
