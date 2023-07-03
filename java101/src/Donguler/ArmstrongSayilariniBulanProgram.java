package Donguler;

import java.util.Scanner;

public class ArmstrongSayilariniBulanProgram {
    public static void main(String[] args) {
        /*
        // pratik //

        //Armstrong Sayı Nedir ?
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        //
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        //
        //1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
        //
        //1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
        //
        //54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
        //

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

         */


        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);

         */

        // odev - Bir sayının basamak sayılarının toplamını hesaplayan program yazınız. //

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int gecici = sayi;

        while (gecici != 0) {
            int basamak = gecici % 10;
            toplam += basamak;
            gecici /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + toplam);

        /*
        bu ödevin çözümünde kullanıcıdan bir -sayi- alıyoruz.
        toplam- degiskenini 0 olarak başlatıyoruz.
        döngü içerisinde girilen sayının her bir basamağını bulmak için 10'a bölümünden kalanı -basamak- ve sayının 10'a bölümünü -gecici- kullanıyoruz.
        her adımda -basamak- değerini -toplam- değişkenine ekliyoruz.
        -geçici- değerini 10'a bölerek bir sonraki basamağa geçiyoruz.
        -döngü bittiğinde -toplam- değeri, sayının basamaklarının toplamını temsil ediyor.
        son olarak -toplam- değeri ekrana basılıyor.
         */
    }
}
