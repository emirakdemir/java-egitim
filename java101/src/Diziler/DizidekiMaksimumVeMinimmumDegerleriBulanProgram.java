package Diziler;

public class DizidekiMaksimumVeMinimmumDegerleriBulanProgram {
    public static void main(String[] args) {

        /*
        // PRATİK

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

         */

        // ÖDEV - Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        int[] liste = {15, 12, 788, 1, -1, -778, 2, 0};
        int hedefSayi = 5;

        int dahaKucukEnYakin = Integer.MIN_VALUE;
        int dahaBuyukEnYakin = Integer.MAX_VALUE;

        for (int sayi : liste) {
            if (sayi < hedefSayi && sayi > dahaKucukEnYakin) {
                dahaKucukEnYakin = sayi;
            }
            if (sayi > hedefSayi && sayi < dahaBuyukEnYakin) {
                dahaBuyukEnYakin = sayi;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + dahaKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + dahaBuyukEnYakin);
    }
}
