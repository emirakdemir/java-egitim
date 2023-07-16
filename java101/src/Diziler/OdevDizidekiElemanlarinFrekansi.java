/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.

 */
package Diziler;

public class OdevDizidekiElemanlarinFrekansi {

    public static void main(String[] args) {

        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] elemanlar = new int[dizi.length];
        int[] frekanslar = new int[dizi.length];
        int elemanSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            boolean elemanVar = false;

            for (int j = 0; j < elemanSayisi; j++) {
                if (elemanlar[j] == eleman) {
                    frekanslar[j]++;
                    elemanVar = true;
                    break;
                }
            }
            if (!elemanVar) {
                elemanlar[elemanSayisi] = eleman;
                frekanslar[elemanSayisi] = 1;
                elemanSayisi++;
            }
        }
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(elemanlar[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
        }
    }
}
