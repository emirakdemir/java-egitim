package Donguler;

import java.util.Scanner;

public class OdevKombinasyonHesaplama {
    public static void main(String[] args) {

        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        int result = kombinasyonHesaplama(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + result);
    }

    public static int kombinasyonHesaplama(int n, int r) {
        int numerator = faktoriyel(n);
        int denominator = faktoriyel(r) * faktoriyel(n - r);
        int result = numerator / denominator;
        return result;
    }

    public static int faktoriyel(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
