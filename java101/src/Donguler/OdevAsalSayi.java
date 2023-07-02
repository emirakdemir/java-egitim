// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

package Donguler;

public class OdevAsalSayi {
    public static void main(String[] args) {

        System.out.println("1 - 100 arasındaki Asal Sayılar:");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            for (int i = 2; i <= sayi/2; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
