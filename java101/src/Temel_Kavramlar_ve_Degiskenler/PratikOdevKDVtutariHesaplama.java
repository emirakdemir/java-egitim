package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class PratikOdevKDVtutariHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ücret tutarını girin: ");
        double tutar = scanner.nextDouble();

// Eğer girilen tutar 0-1000 arasında ise KDV oranı %18, tutar 1000 TL'den büyük ise KDV oranı %8.

        double kdvOrani = (tutar > 0 && tutar <= 1000) ? 0.18 : 0.08;

        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar: " + tutar + "TL");
        System.out.println("KDV Oranı: " + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutarı: " + kdvTutari + "TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + "TL");

    }
}
