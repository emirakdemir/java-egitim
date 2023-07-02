package Donguler;

import java.util.Scanner;

public class TekSayilarinToplamiProgram {
    public static void main(String[] args) {
        /*
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.//
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            n = scan.nextInt();
            if (n % 2 == 1){
                total += n;
            }
        } while (n > 0);
        System.out.println("Toplam : " + total);

         */

        // ODEV - Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.//

        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çıkmak için 0'a basınız.");

        do {
            System.out.print("Sayı giriniz: ");
            number = scanner.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        } while (number != 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);

    }
}
