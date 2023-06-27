// ODEV //

package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        input.close();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double normalTutar = mesafe * 0.10;

        double indirim = 0;

        if (yas < 12) {
            indirim = normalTutar * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirim = normalTutar * 0.10;
        } else if (yas > 65) {
            indirim = normalTutar * 0.30;
        }

        double indirimliTutar = normalTutar - indirim;

        if (yolculukTipi == 2) {
            indirimliTutar *= 0.80; // Gidiş-dönüş indirimi
        }

        double toplamTutar = yolculukTipi == 2 ? indirimliTutar * 2 : indirimliTutar;

        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
    }
}
