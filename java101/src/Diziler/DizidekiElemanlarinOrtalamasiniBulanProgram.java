package Diziler;

public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    // Pratik
   /* public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);


    }

    */


    // Ödev
    //Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
    //
    //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;  // baslangıcta sıfıra atanır

        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }

        double harmonicMean = numbers.length / sum;

        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
