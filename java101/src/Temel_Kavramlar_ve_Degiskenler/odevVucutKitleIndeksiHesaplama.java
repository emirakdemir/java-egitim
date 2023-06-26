/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
*/

package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class odevVucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boyunuzu m cinsinden giriniz: ");
        double boy = scanner.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi (VKİ): " + vki);
    }
}
