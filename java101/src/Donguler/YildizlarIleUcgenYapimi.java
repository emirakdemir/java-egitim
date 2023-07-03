package Donguler;

import java.util.Scanner;

public class YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
        /*
        // pratik //
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

         */

        // odev - Java'da döngüler kullanarak yıldızlar ile elmas yapınız. //

        Scanner input = new Scanner(System.in);
        System.out.print("Elmas yüksekligi giriniz: ");
        int yukseklik = input.nextInt();

        int boslukSayisi = yukseklik - 1;
        int yildizSayisi = 1;

        // Üst kısmı çizdirme
        for (int i = 0; i < yukseklik; i++) {

            // Boşlukları yazdırma
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi--;
            yildizSayisi += 2;
        }

        boslukSayisi = 1;
        yildizSayisi = 2 * yukseklik - 3;

        // Alt kısmı çizdirme
        for (int i = 0; i < yukseklik - 1; i++) {

            // Boşlukları yazdırma
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();

            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
}
