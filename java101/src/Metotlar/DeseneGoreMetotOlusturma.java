/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */

package Metotlar;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static void kuralaUyanDongu(int sayi) {
        System.out.print(sayi + " ");
        if (sayi > 0) {
            kuralaUyanDongu(sayi - 5);
        }
        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        kuralaUyanDongu(n);
    }
}
