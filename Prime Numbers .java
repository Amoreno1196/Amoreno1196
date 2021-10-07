/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_6;

/**
 *
 * @author Angel
 */
public class EX_6_27 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count < 100; i++) {
            if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0 && i != 0) System.out.println();
            }
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static long reverse(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(long number) {
        return (number == reverse(number));
    }
}

