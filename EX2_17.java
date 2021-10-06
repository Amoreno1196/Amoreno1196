
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class EX2_17 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature between -58\u00b0F and 41\u00b0F: ");
        double t = in.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double v = in.nextDouble();
        double wcf = 35.74 + 0.6215*t - 35.75*Math.pow(v, 0.16) + 0.4275*t*Math.pow(v, 0.16);
        System.out.println("The wind chill index is " + wcf);
    }
}
}
