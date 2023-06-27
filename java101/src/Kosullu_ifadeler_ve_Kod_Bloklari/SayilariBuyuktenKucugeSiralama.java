package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        /*

        // Pratik //

        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayı: ");
        a = input.nextInt();

        System.out.println("2.Sayı: ");
        b = input.nextInt();

        System.out.println("3.Sayı: ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        }else if ((b > a) && (b > c)){
            if (a > c) {
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        } else if ((c > b) && (c > a)) {
            if (a > b){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }

         */

        // Odev - Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. //

        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        sayi3 = input.nextInt();

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Sıralama: " + sayi1 + " < " + sayi2 + " < " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + " < " + sayi3 + " < " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Sıralama: " + sayi2 + " < " + sayi1 + " < " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + " < " + sayi3 + " < " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Sıralama: " + sayi3 + " < " + sayi1 + " < " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + " < " + sayi2 + " < " + sayi1);
            }
        }
    }
}
