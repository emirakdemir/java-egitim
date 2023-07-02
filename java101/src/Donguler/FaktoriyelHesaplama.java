package Donguler;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        //pratik//
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyel Sayısı: ");
        int n = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.println(n + ".Faktöriyel :" + total);
    }
}
