package Donguler;

import java.util.Scanner;

public class GirilenSayidanKücükikininKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        /*
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i*=2){
            System.out.println(i);
        }

         */

        // odev - Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz. //
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        int kuvvet4 = 4;
        int kuvvet5 = 5;

        while (kuvvet4 <= n || kuvvet5 <= n) {
            if (kuvvet4 <= n) {
                System.out.println(kuvvet4);
                kuvvet4 *= 4;
            }
            if (kuvvet5 <= n) {
                System.out.println(kuvvet5);
                kuvvet5 *= 5;
            }
        }
    }
}
