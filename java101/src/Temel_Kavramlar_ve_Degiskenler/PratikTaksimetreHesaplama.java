/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class PratikTaksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar: " + total);

    }
}
